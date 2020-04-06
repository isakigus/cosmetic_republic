package cosmetic.modelo.entidad;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "etiquetaProducto")
@Component
@Scope("prototype")
public class EtiquetaProducto extends Imagen {

}
