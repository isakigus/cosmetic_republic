package cosmetic.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cosmetic.modelo.entidad.Precio;
import cosmetic.modelo.persistencia.PrecioDao;

@RestController
public class PrecioControlador {
	
	
	private final PrecioDao precioDao;

	public PrecioControlador(PrecioDao precioDao) {
		this.precioDao = precioDao;
	}
	
	@GetMapping("/Precios")
	List<Precio>listar(){
		return precioDao.findAll();
	}
	
	@GetMapping("/Precio/{id}")
	public ResponseEntity<Precio>obtener(@PathVariable int id){
		
		Optional<Precio> opt = precioDao.findById(id);
		if (opt.isPresent()) {
			return new ResponseEntity<Precio>(opt.get(), HttpStatus.OK);					
		}else {
			return new ResponseEntity<Precio>(HttpStatus.NOT_FOUND);
			
		}
	
	}

	//{"fechaCompra": , "ingrediente: ,"precio":, "gramos": , "precioTotal": }
	@PostMapping("/Precio")
	Precio altaPrecio(@RequestBody Precio nuevoPrecio) {
		return precioDao.save(nuevoPrecio);
	}
	
	@PutMapping("/Precio/{id}")
	public ResponseEntity<Precio>modificarPrecio(@RequestBody Precio nuevoPrecio, @PathVariable int id){
		Optional<Precio> opt = precioDao.findById(id);
		if(opt.isPresent()) { 
			nuevoPrecio.setId(id);
			precioDao.save(nuevoPrecio);
			return new ResponseEntity<Precio>(nuevoPrecio,HttpStatus.OK);
		}else {
			nuevoPrecio.setId(id);
			return new ResponseEntity<Precio>(nuevoPrecio,HttpStatus.NOT_FOUND);
		}
	}
	@DeleteMapping("/Precio/{id}")
	void borrarPrecio(@PathVariable int id) {
		precioDao.deleteById(id);
	}
	
}

