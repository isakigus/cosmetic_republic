package cosmetic.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cosmetic.modelo.entidad.Ingrediente;
import cosmetic.modelo.persistencia.IngredienteDao;

@RestController
public class ControladorIngrediente {

	private final IngredienteDao ingredienteDao;

	public ControladorIngrediente(IngredienteDao ingredienteDao) {
		super();
		this.ingredienteDao = ingredienteDao;
	}

	@PostMapping("/Ingrediente")
	Ingrediente alta(@RequestBody Ingrediente nuevoIngrediente) {
		return ingredienteDao.save(nuevoIngrediente);
	}

	@PostMapping("/Ingrediente/{id}")
	public ResponseEntity<Ingrediente> modificar(@RequestBody Ingrediente ingredienteModificado, @PathVariable int id) {

		Ingrediente opt = ingredienteDao.findById(id);
		if (opt != null) {
			ingredienteModificado.setId(id);
			ingredienteDao.save(ingredienteModificado);
			return new ResponseEntity<Ingrediente>(ingredienteModificado, HttpStatus.OK);
		} else {
			return new ResponseEntity<Ingrediente>(ingredienteModificado, HttpStatus.NOT_FOUND);
		}

	}

	@DeleteMapping("/Ingrediente/{id}")
	void borrarIngredientePorId(@PathVariable Long id) {
		ingredienteDao.deleteById(id.intValue());
	}

	@GetMapping("/Ingredientes")
	List<Ingrediente> listar() {
		return ingredienteDao.findAll();
	}

	@GetMapping("/Ingredientes/{id}")
	Ingrediente buscarPorId(@PathVariable Long id) {
		return ingredienteDao.findById(id.intValue());
	}
	/*
	 * @GetMapping("/Ingredientes/{nombre}") List<Ingrediente>
	 * buscarPorNombre(@PathVariable String nombre) { return
	 * ingredienteDao.findByNombreContainingIgnoreCase(nombre); }
	 * 
	 * @GetMapping("/Ingredientes/{producto}") List<Ingrediente>
	 * buscarPorProducto(@PathVariable Producto producto) { return
	 * ingredienteDao.findByProducto(producto); }
	 */
}
