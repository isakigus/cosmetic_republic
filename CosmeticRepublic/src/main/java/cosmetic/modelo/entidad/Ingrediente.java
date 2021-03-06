package cosmetic.modelo.entidad;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.sun.istack.Nullable;

import cosmetic.modelo.entidad.Producto;

@Entity
@Table(name = "ingrediente")
@Component
@Scope("prototype")
public class Ingrediente extends ElementoCosmetico {

	@OneToOne
	private AtributoCosmetico categoriaIngrediente;
	@Nullable
	@OneToOne
	private Producto producto;

	public String toString() {
		return "Ingrediente [id=" + id + ", categoriaIngrediente=" + categoriaIngrediente + ", producto=" + producto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AtributoCosmetico getCategoriaIngrediente() {
		return categoriaIngrediente;
	}

	public void setCategoriaIngrediente(AtributoCosmetico categoriaIngrediente) {
		this.categoriaIngrediente = categoriaIngrediente;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}
