package cosmetic.modelo.entidad;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.Nullable;

import cosmetic.modelo.entidad.Producto;
//Ingredientes de los que se componen los productos. 
@Entity
@Table(name = "ingrediente")
@Component
@Scope("prototype")
public class Ingrediente extends ElementoCosmetico {

	@OneToOne
	private AtributoCosmetico categoriaIngrediente;//Para saber que tipo de ingrediente es, aceite, mica, ae, etc..
	@Nullable
	@OneToOne
	private Producto producto;//Un producto puede ser un ingrediente de otro produto, ejmp las sinergias.
	
	@JsonIgnore
	@ElementCollection
	@OneToMany(targetEntity = AtributoCosmetico.class, mappedBy = "elementoCosmetico")
	private List<AtributoCosmetico> atributosCosmeticos;//Lista de caracteristicas de un ingrediente, humectante, espumante, aroma etc...

	

	@Override
	public String toString() {
		return "Ingrediente [categoriaIngrediente=" + categoriaIngrediente + ", producto=" + producto
				+ ", atributosCosmeticos=" + atributosCosmeticos + "]";
	}
	

	public List<AtributoCosmetico> getAtributosCosmeticos() {
		return atributosCosmeticos;
	}


	public void setAtributosCosmeticos(List<AtributoCosmetico> atributosCosmeticos) {
		this.atributosCosmeticos = atributosCosmeticos;
	}


	public Ingrediente() {
		super();
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
