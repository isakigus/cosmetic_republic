package cosmetic.modelo.entidad;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "elementoCosmetico")
@Component
@Scope("prototype")
public class Producto extends ElementoCosmetico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private List<Imagen> imagenes;
	private List<Imagen> etiquetas;
	private AtributoCosmetico categoriaCosmetica;
	private List<Receta> recetas;

	@Override
	public String toString() {
		return "Producto Id: " + id + ", imagenes: " + imagenes + ", categoriaCosmetica: "
				+ categoriaCosmetica + ", etiquetas: " + etiquetas + ", recetas: " + recetas;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Imagen> getImagenes() {
		return imagenes;
	}

	public void setImagenes(List<Imagen> imagenes) {
		this.imagenes = imagenes;
	}

	public List<Imagen> getEtiquetas() {
		return etiquetas;
	}

	public void setEtiquetas(List<Imagen> etiquetas) {
		this.etiquetas = etiquetas;
	}

	public AtributoCosmetico getCategoriaCosmetica() {
		return categoriaCosmetica;
	}

	public void setCategoriaCosmetica(AtributoCosmetico categoriaCosmetica) {
		this.categoriaCosmetica = categoriaCosmetica;
	}

	public List<Receta> getRecetas() {
		return recetas;
	}

	public void setRecetas(List<Receta> recetas) {
		this.recetas = recetas;
	}

}
