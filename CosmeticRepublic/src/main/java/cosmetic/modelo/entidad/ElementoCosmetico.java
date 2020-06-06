package cosmetic.modelo.entidad;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "elementoCosmetico")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class ElementoCosmetico {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	private String nombre;

	@ElementCollection
	@OneToMany(targetEntity = AtributoCosmetico.class, mappedBy = "elementoCosmetico", fetch = FetchType.EAGER)
	private List<AtributoCosmetico> atributosCosmeticos;
	private String comentario;

	@Override
	public String toString() {
		return "Nnombre: " + nombre + ", atributoCosmetico: \n" + atributosCosmeticos + ", comentario: " + comentario;
	}

	public ElementoCosmetico() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<AtributoCosmetico> getAtributoCosmetico() {
		return atributosCosmeticos;
	}

	public void setAtributoCosmetico(List<AtributoCosmetico> atributoCosmetico) {
		this.atributosCosmeticos = atributoCosmetico;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

}
