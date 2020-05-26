package cosmetic.modelo.negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cosmetic.modelo.entidad.AtributoCosmetico;
import cosmetic.modelo.entidad.CategoriaAtributo;
import cosmetic.modelo.persistencia.AtributoCosmeticoDao;

@Service
public class AtributoCosmeticoGestor {

	@Autowired
	private AtributoCosmeticoDao dao;

	@Transactional
	public AtributoCosmetico alta(AtributoCosmetico atributoCosmetico) {

		return dao.save(atributoCosmetico);
	}

	@Transactional
	public void borrarId(int id) {
		dao.deleteById(id);
	}
	
	//Ojo pasar el id 
	@Transactional
	public AtributoCosmetico modificar(AtributoCosmetico atributoCosmetico) {
		return dao.save(atributoCosmetico);
	}
	
	public void obtener(int id) {
		
		dao.findById(id).get(id);
	}
	
	public List<AtributoCosmetico>listar(){
		return dao.findAll();
	}
	
	public List<AtributoCosmetico>listarPorNombre(String nombre){
		
		return dao.findByNombreContainingIgnoreCase(nombre);
	}
	
	public List<AtributoCosmetico>listarPorId(int id){
		return dao.findById(id);
	}
	
	public List<AtributoCosmetico>listarPorCategoria(CategoriaAtributo categoriaAtributo){
		return dao.findByIgnoreContainingCaseCategoriaAtributo(categoriaAtributo);
	}

}
