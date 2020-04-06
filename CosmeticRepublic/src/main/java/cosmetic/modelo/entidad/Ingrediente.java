package cosmetic.modelo.entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.sun.istack.Nullable;

@Entity
@Table(name = "elementoCosmetico")
@Component
@Scope("prototype")
public class Ingrediente extends ElementoCosmetico {
	
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private CategoriaIngrediente categoriaIngrediente;
	@Nullable
	private Producto producto;
	

	

	@Override
	public String toString() {
		return "Ingrediente id: " + id + ", CategoriaIngrediente: " + categoriaIngrediente + ", producto: \n" + producto;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AtributoCosmetico getCategoriaIngrediente() {
		return getCategoriaIngrediente();
	}

	
	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public CategoriaIngrediente getCategoriaIngredinte() {
		return categoriaIngrediente;
	}

	public void setCategoriaIngredinte(CategoriaIngrediente categoriaIngredinte) {
		this.categoriaIngrediente = categoriaIngredinte;
	}

	

	
}
