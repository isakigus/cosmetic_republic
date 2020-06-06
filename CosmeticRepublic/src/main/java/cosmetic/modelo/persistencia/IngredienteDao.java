package cosmetic.modelo.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;

import cosmetic.modelo.entidad.Ingrediente;

public interface IngredienteDao extends JpaRepository<Ingrediente, Integer> {

	Ingrediente findById(int id);

	// List<Ingrediente> findByNombreContainingIgnoreCase(String nombre);

	// List<Ingrediente> findByProducto(Producto producto);

	// @Query("SELECT id, nombre, atributosCosmeticos, comentario,
	// categoriaIngrediente, producto FROM ingredientes WHERE atributoCosmetico=?");

	// List<Ingrediente> findByAtributosCosmeticos(String atributosCosmeticos);

	// Ingrediente findByAtributoCosmetico(AtributoCosmetico categoriaIngrediente);

}
