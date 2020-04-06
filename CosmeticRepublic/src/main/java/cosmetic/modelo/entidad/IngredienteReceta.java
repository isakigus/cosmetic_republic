package cosmetic.modelo.entidad;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Entity
//@Table(name = "ingredienteReceta")
@Component
@Scope("prototype")
public class IngredienteReceta {
	
	private Ingrediente ingrediente;
	private Receta receta;
	private double porcentaje;
	
	
	
	@Override
	public String toString() {
		return "IngredienteReceta [ingrediente=" + ingrediente + ", receta=" + receta + ", porcentaje=" + porcentaje
				+ "]";
	}
	
	public Ingrediente getIngrediente() {
		return ingrediente;
	}
	public void setIngrediente(Ingrediente ingrediente) {
		this.ingrediente = ingrediente;
	}
	public Receta getReceta() {
		return receta;
	}
	public void setReceta(Receta receta) {
		this.receta = receta;
	}
	public double getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}
	
	
	
	
	
	

}
