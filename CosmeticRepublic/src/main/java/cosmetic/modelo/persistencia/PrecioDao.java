package cosmetic.modelo.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;

import cosmetic.modelo.entidad.Precio;
												//<Entidad, clave primaria>
public interface PrecioDao extends JpaRepository<Precio, Integer>{
	
	

}
