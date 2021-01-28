package cosmetic.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cosmetic.modelo.entidad.IngredienteReceta;
import cosmetic.modelo.persistencia.IngredienteRecetaDao;

@RestController
public class IngredienteRecetaControlador {
	
	@Autowired
	IngredienteRecetaDao ingredienteRecetaDao;
	
		
	@GetMapping("/IngredienteReceta/{id}")
 public ResponseEntity<IngredienteReceta> buscarPorId(@PathVariable int id) {
		Optional<IngredienteReceta> opt = ingredienteRecetaDao.findById(id);
		if(opt.isPresent()) {
			return new ResponseEntity<IngredienteReceta>(opt.get(),HttpStatus.OK);
		}else {
			return new ResponseEntity<IngredienteReceta>(HttpStatus.NOT_FOUND);
		}
	}
	
	
	@GetMapping("/IngredientesReceta")
	List<IngredienteReceta> listar() {
		return ingredienteRecetaDao.findAll();
	}
	
	//{"porcentaje": 11.11}
	@PostMapping("/IngredienteReceta")
	IngredienteReceta alta (@RequestBody IngredienteReceta nuevoIngredienteReceta) {
		return ingredienteRecetaDao.save(nuevoIngredienteReceta);
	}
	
	//REVISAR NO VA
	@PutMapping("/IngredienteReceta/{id}")
	public ResponseEntity<IngredienteReceta> modificarIngredienteReceta(@RequestBody IngredienteReceta ingredienteReceta, @PathVariable int id) {
		Optional<IngredienteReceta>opt = ingredienteRecetaDao.findById(id);
		if(opt.isPresent()) {
			ingredienteReceta.setId(id);
			ingredienteRecetaDao.save(ingredienteReceta);
			return new ResponseEntity<IngredienteReceta>(ingredienteReceta,HttpStatus.OK);
		}else {
			ingredienteReceta.setId(id);
			return new ResponseEntity<IngredienteReceta>(ingredienteReceta,HttpStatus.NOT_FOUND);
		}
	}
	
	
	 /* {		
		IngredienteReceta ingRecObjeto = null;
		ingRecObjeto = ingredienteRecetaDao.findById(id);
		if(ingredienteRecetaDao==null) {
			ingRecObjeto = new IngredienteReceta();
		}
		ingRecObjeto.setId(ingredienteReceta.getId());
		return ingRecObjeto;
	}*/
	//REVISAR NO VA
	@DeleteMapping("/IngredienteReceta/{id}")
	void borrarIngredienteReceta(@PathVariable int id) {
		ingredienteRecetaDao.deleteById(id);
	
	}
}
