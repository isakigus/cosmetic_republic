package cosmetic.modelo.entidad;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "elementoCosmetico")
@Component
public abstract class ElementoCosmetico {

	private String nombre;
	private List<AtributoCosmetico> atributoCosmetico;
	private String comentario;

	@Override
	public String toString() {
		return "Nnombre: " + nombre + ", atributoCosmetico: \n" + atributoCosmetico
				+ ", comentario: " + comentario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<AtributoCosmetico> getAtributoCosmetico() {
		return atributoCosmetico;
	}

	public void setAtributoCosmetico(List<AtributoCosmetico> atributoCosmetico) {
		this.atributoCosmetico = atributoCosmetico;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	

	

	

}
