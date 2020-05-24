package cosmetic.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cosmetic.modelo.persistencia.AtributoCosmeticoDao;
import cosmetic.modelo.entidad.AtributoCosmetico;

@RestController
class AtributoCosmeticoController {

    private final AtributoCosmeticoDao atributo;

    AtributoCosmeticoController(AtributoCosmeticoDao atributo) {
        this.atributo = atributo;
    }

    @GetMapping("/AtributoCosmeticos")
    List<AtributoCosmetico> all() {
        return atributo.findAll();
    }

    @PostMapping("/AtributoCosmeticos")
    AtributoCosmetico newAtributoCosmetico(@RequestBody AtributoCosmetico newAtributoCosmetico) {
        return atributo.save(newAtributoCosmetico);
    }

    // Single item
    @GetMapping("/AtributoCosmeticos/{id}")
    AtributoCosmetico one(@PathVariable Long id) {

        // return atributo.findById(id).orElseThrow(() -> new
        // AtributoCosmeticoNotFoundException(id));
        return atributo.findById(id.intValue());
    }

    @PutMapping("/AtributoCosmeticos/{id}")
    AtributoCosmetico replaceAtributoCosmetico(@RequestBody AtributoCosmetico newAtributoCosmetico,
            @PathVariable Long id) {

        AtributoCosmetico atributo_obj = null;
        atributo_obj = atributo.findById(id.intValue());
        if (atributo == null) {
            atributo_obj = new AtributoCosmetico();
        }

        atributo_obj.setNombre(newAtributoCosmetico.getNombre());
        atributo_obj.setNombre(newAtributoCosmetico.getNombre());

        return atributo_obj;

    }

    @DeleteMapping("/AtributoCosmeticos/{id}")
    void deleteAtributoCosmetico(@PathVariable Long id) {
        atributo.deleteById(id.intValue());
    }
}