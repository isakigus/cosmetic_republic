package cosmetic.modelo.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cosmetic.modelo.persistencia.AtributoCosmeticoDao;

@Service
public class AtributoCosmeticoGestor {

	@Autowired
	private AtributoCosmeticoDao atributoCosmeticoDao;

}
