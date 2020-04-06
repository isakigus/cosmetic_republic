package cosmetic.modelo.entidad;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "imagenProducto")
@Component
@Scope("prototype")
public class ImagenProducto extends Imagen {

}
