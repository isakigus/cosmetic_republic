package cosmetic.modelo.entidad;

import java.util.List;

public abstract class ElementoCosmetico {

	private String nombre;
	// @OneToMany(mappedBy = "atributoCosmetico")
	private List<AtributoCosmetico> atributoCosmetico;// OneToMany
	private String comentario;

	@Override
	public String toString() {
		return "Nnombre: " + nombre + ", atributoCosmetico: \n" + atributoCosmetico + ", comentario: " + comentario;
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
