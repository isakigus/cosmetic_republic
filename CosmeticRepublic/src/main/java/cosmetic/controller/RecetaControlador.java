
package cosmetic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cosmetic.modelo.entidad.Receta;
import cosmetic.modelo.persistencia.RecetaDao;

@RestController
public class RecetaControlador {
	
	@Autowired
	RecetaDao recetaDao;
	
	//NO VA NADA
	
	public RecetaControlador(RecetaDao recetaDao) {
		super();
		this.recetaDao = recetaDao;
	}

	@GetMapping("/Recetas")
	public List<Receta>listar(){
		return recetaDao.findAll();
		
	}
	
	@GetMapping(path="Receta/{id}")
	Receta buscarPorId(@PathVariable int id) {
		return recetaDao.findById(id);
	}
	@PostMapping("/Receta")
	Receta alta(@RequestBody Receta nuevaReceta) {
		return recetaDao.save(nuevaReceta);
	}
	
	

}

