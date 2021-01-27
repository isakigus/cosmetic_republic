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

import cosmetic.modelo.entidad.Imagen;
import cosmetic.modelo.persistencia.ImagenDao;

@RestController
public class ImagenControlador {

	private final ImagenDao imagenDao;

	ImagenControlador(ImagenDao imagenDao) {
		this.imagenDao = imagenDao;
	}

	@GetMapping("/Imagenes")

	List<Imagen> listar() {
		return imagenDao.findAll();
	}

	@GetMapping("/Imagen/{id}")
	public ResponseEntity<Imagen> obtener(@PathVariable int id) {
		Optional<Imagen> opt = imagenDao.findById(id);
		if (opt.isPresent()) {
			return new ResponseEntity<Imagen>(opt.get(), HttpStatus.OK);

		} else {
			return new ResponseEntity<Imagen>(HttpStatus.NOT_FOUND);

		}
	}
	//{"tipoFichero":""}
	@PostMapping("/Imagen")
	Imagen altaImagen(@RequestBody Imagen nuevaImagen) {
		return imagenDao.save(nuevaImagen);
	}

	@PutMapping(path = "/Imagen/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Imagen> modificarImagen(@RequestBody Imagen nuevaImagen, @PathVariable int id) {
		Optional<Imagen> opt = imagenDao.findById(id);
		if (opt.isPresent()) {
			nuevaImagen.setId(id);
			imagenDao.save(nuevaImagen);
			return new ResponseEntity<Imagen>(nuevaImagen, HttpStatus.OK);
		} else {
			nuevaImagen.setId(id);
			return new ResponseEntity<Imagen>(nuevaImagen, HttpStatus.NOT_FOUND);
		}
	}
//Error 405, ¿sera por Producto?.
	@DeleteMapping(path = "Imagen/{id}")
	public ResponseEntity<Imagen> borrar(@PathVariable Integer id) {

		imagenDao.deleteById(id);
		Optional<Imagen> opt = imagenDao.findById(id);
		if (opt.isPresent()) {
			imagenDao.deleteById(id);
			return new ResponseEntity<Imagen>(opt.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<Imagen>(HttpStatus.NOT_FOUND);

		}

	}

}
