package cosmetic.modelo.entidad;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	@OneToMany(mappedBy = "imagenProducto")
	private List<ImagenProducto> imagenes;//one to many
	@OneToMany(mappedBy = "etiquetaProducto")
	private List<EtiquetaProducto> etiquetas;//one to many
	private AtributoCosmetico categoriaCosmetica;
	@OneToMany(mappedBy = "receta")
	private List<Receta> recetas;//One to many
	
		
	@Override
	public String toString() {
		return "Producto [id=" + id + ", imagenes=" + imagenes + ", etiquetas=" + etiquetas + ", categoriaCosmetica="
				+ categoriaCosmetica + ", recetas=" + recetas + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<ImagenProducto> getImagenes() {
		return imagenes;
	}
	public void setImagenes(List<ImagenProducto> imagenes) {
		this.imagenes = imagenes;
	}
	public List<EtiquetaProducto> getEtiquetas() {
		return etiquetas;
	}
	public void setEtiquetas(List<EtiquetaProducto> etiquetas) {
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
