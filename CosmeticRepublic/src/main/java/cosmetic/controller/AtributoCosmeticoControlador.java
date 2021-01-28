package cosmetic.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
class AtributoCosmeticoControlador {

	private final AtributoCosmeticoDao atributoDao;

	AtributoCosmeticoControlador(AtributoCosmeticoDao atributo) {
		this.atributoDao = atributo;
	}

	@GetMapping("/AtributosCosmeticos")
	List<AtributoCosmetico> listar() {
		return atributoDao.findAll();
	}
	
	// Single item
	@GetMapping("/AtributoCosmetico/{id}")
	public ResponseEntity<AtributoCosmetico> obtener(@PathVariable int id) {

		Optional<AtributoCosmetico> opt = atributoDao.findById(id);
		if (opt.isPresent()) {
			return new ResponseEntity<AtributoCosmetico>(opt.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<AtributoCosmetico>(HttpStatus.NOT_FOUND);
		}
	}
	
	//{"categoriaAtributo":"", "nombre":""}
		@PostMapping("/AtributoCosmetico")
		AtributoCosmetico altaAtributoCosmetico(@RequestBody AtributoCosmetico nuevoAtributoCosmetico) {
			return atributoDao.save(nuevoAtributoCosmetico);
		}

	//{"categoriaAtributo":"", "nombre":""}
	@PutMapping(path = "/AtributoCosmetico/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AtributoCosmetico> modificarAtributoCosmetico(
			@RequestBody AtributoCosmetico nuevoAtributoCosmetico, @PathVariable int id) {

		Optional<AtributoCosmetico> opt = atributoDao.findById(id);
		if (opt.isPresent()) {
			nuevoAtributoCosmetico.setId(id);
			atributoDao.save(nuevoAtributoCosmetico);
			return new ResponseEntity<AtributoCosmetico>(nuevoAtributoCosmetico,HttpStatus.OK);
		} else {
			nuevoAtributoCosmetico.setId(id);
			return new ResponseEntity<AtributoCosmetico>(nuevoAtributoCosmetico,HttpStatus.NOT_FOUND);
		}
		
	}	

	@DeleteMapping("/AtributoCosmetico/{id}")
	void borrarAtributoCosmetico(@PathVariable Long id) {
		atributoDao.deleteById(id.intValue());
	}
}