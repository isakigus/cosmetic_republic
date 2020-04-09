package cosmetic.modelo.entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "atributoCosmetico")
@Component
@Scope("prototype")
public class AtributoCosmetico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private CategoriaAtributo categoriaAtributo;
	// Referenciar al resto de enum desde negocio
	@ManyToOne
	private ElementoCosmetico atributoCosmetico;

	@Override
	public String toString() {
		return "AtributoCosmetico [id=" + id + ", nombre=" + nombre + ", categoriaAtributo=" + categoriaAtributo
				+ ", atributoCosmetico=" + atributoCosmetico + "]";
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

	public CategoriaAtributo getCategoriaAtributo() {
		return categoriaAtributo;
	}

	public void setCategoriaAtributo(CategoriaAtributo categoriaAtributo) {
		this.categoriaAtributo = categoriaAtributo;
	}

	public ElementoCosmetico getAtributoCosmetico() {
		return atributoCosmetico;
	}

	public void setAtributoCosmetico(ElementoCosmetico atributoCosmetico) {
		this.atributoCosmetico = atributoCosmetico;
	}

}
