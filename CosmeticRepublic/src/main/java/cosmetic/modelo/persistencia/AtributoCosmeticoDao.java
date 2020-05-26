package cosmetic.modelo.persistencia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cosmetic.modelo.entidad.AtributoCosmetico;
import cosmetic.modelo.entidad.CategoriaAtributo;

@Repository
public interface AtributoCosmeticoDao extends JpaRepository<AtributoCosmetico, Integer>{
	
	List<AtributoCosmetico>findByNombreContainingIgnoreCase(String nombre);
	List<AtributoCosmetico>findById(int id);
	List<AtributoCosmetico>findByIgnoreContainingCaseCategoriaAtributo(CategoriaAtributo CategoriaAtributo);

}
