package cosmetic.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cosmetic.modelo.entidad.AtributoCosmetico;
import cosmetic.modelo.negocio.AtributoCosmeticoGestor;

@RestController
public class controladorAtributoCosmetico {
	
	@Autowired
	private AtributoCosmeticoGestor aCg;
	
	@Autowired
	private AtributoCosmetico atributoCosmetico;
	
	@GetMapping(path = "AtributoCosmetico", produces = {MediaType.APPLICATION_JSON_VALUE})
	
	public ResponseEntity<AtributoCosmetico>listar(){
		
		List<AtributoCosmetico> lista = aCg.listar();
		
		
	}
	
}

