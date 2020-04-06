package cosmetic.modelo.entidad;

import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "imagen")
@Component
@Scope("prototype")
public class Imagen {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Producto producto;
	private Blob imagen;

	@Override
	public String toString() {
		return "Imagen: id: " + id + ", producto: \n " + producto + ", imagen: " + imagen;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Blob getImagen() {
		return imagen;
	}

	public void setImagen(Blob imagen) {
		this.imagen = imagen;
	}

}
