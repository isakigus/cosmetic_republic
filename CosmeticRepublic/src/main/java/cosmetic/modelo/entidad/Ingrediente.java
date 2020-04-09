package cosmetic.modelo.entidad;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
	@Enumerated(EnumType.STRING)
	private CategoriaIngrediente categoriaIngrediente;
	@Nullable
	private Producto producto;
	@ManyToOne
	private Receta receta;

	@Override
	public String toString() {
		return "Ingrediente [id=" + id + ", categoriaIngrediente=" + categoriaIngrediente + ", producto=" + producto
				+ ", receta=" + receta + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public CategoriaIngrediente getCategoriaIngrediente() {
		return categoriaIngrediente;
	}

	public void setCategoriaIngrediente(CategoriaIngrediente categoriaIngrediente) {
		this.categoriaIngrediente = categoriaIngrediente;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Receta getIngrediente() {
		return receta;
	}

	public void setIngrediente(Receta ingrediente) {
		this.receta = ingrediente;
	}

}
