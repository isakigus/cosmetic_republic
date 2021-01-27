package cosmetic.modelo.persistencia;


import org.springframework.data.jpa.repository.JpaRepository;

import cosmetic.modelo.entidad.Imagen;
import cosmetic.modelo.entidad.TipoFichero;
												//Entidad, Clave primaria
public interface ImagenDao extends JpaRepository<Imagen, Integer>{
	
	//Producto findByPproducto(int id);
	//Imagen findById (int id);Da error con Optional.
	TipoFichero findByTipoFichero (String tipoFichero);
	
	
	

}
