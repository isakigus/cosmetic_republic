package cosmetic.modelo.entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



@Entity
@Table(name = "atributoCosmetico")
@Component
@Scope("prototype")
public class AtributoCosmetico {
//PropiedadCosmetica, CategoriaCosmetica, CategoriaIngrediente, Tienda
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private CategoriaAtributo categoriaAtributoCosmetico;
	private PropiedadCosmetica propiedadCosmetica;
	private CategoriaCosmetica categoriaCosmetica;
	private CategoriaIngrediente categoriaIngrediente;
	private Tienda tienda;

	@Override
	public String toString() {
		return "\n AtributoCosmetico \n id: " + id + ", nombre: " + nombre + ", categoriaAtributoCosmetico: "
				+ categoriaAtributoCosmetico + ", propiedadCosmetica: " + propiedadCosmetica + ", categoriaCosmetica: "
				+ categoriaCosmetica + ", categoriaIngrediente: " + categoriaIngrediente + ", tienda: " + tienda;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public CategoriaAtributo getCategoriaAtributoCosmetico() {
		return categoriaAtributoCosmetico;
	}

	public void setCategoriaAtributoCosmetico(CategoriaAtributo categoriaAtributoCosmetico) {
		this.categoriaAtributoCosmetico = categoriaAtributoCosmetico;
	}

	public PropiedadCosmetica getPropiedadCosmetica() {
		return propiedadCosmetica;
	}

	public void setPropiedadCosmetica(PropiedadCosmetica propiedadCosmetica) {
		this.propiedadCosmetica = propiedadCosmetica;
	}

	public CategoriaCosmetica getCategoriaCosmetica() {
		return categoriaCosmetica;
	}

	public void setCategoriaCosmetica(CategoriaCosmetica categoriaCosmetica) {
		this.categoriaCosmetica = categoriaCosmetica;
	}

	

	public CategoriaIngrediente getCategoriaIngrediente() {
		return categoriaIngrediente;
	}

	public void setCategoriaIngrediente(CategoriaIngrediente categoriaIngrediente) {
		this.categoriaIngrediente = categoriaIngrediente;
	}

	public Tienda getTienda() {
		return tienda;
	}

	public void setTienda(Tienda tienda) {
		this.tienda = tienda;
	}

}
