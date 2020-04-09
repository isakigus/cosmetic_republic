package cosmetic.test;

import java.util.ArrayList;
import java.util.List;

import cosmetic.modelo.entidad.AtributoCosmetico;
import cosmetic.modelo.entidad.CategoriaAtributo;
import cosmetic.modelo.entidad.CategoriaCosmetica;
import cosmetic.modelo.entidad.CategoriaIngrediente;
import cosmetic.modelo.entidad.EtiquetaProducto;
import cosmetic.modelo.entidad.Imagen;
import cosmetic.modelo.entidad.ImagenProducto;
import cosmetic.modelo.entidad.Ingrediente;
import cosmetic.modelo.entidad.IngredienteReceta;
import cosmetic.modelo.entidad.Producto;
import cosmetic.modelo.entidad.PropiedadCosmetica;
import cosmetic.modelo.entidad.Receta;
import cosmetic.modelo.entidad.Tienda;

public class TestEntidades {

	public static void main(String[] args) {

		AtributoCosmetico atributoCosmetico = new AtributoCosmetico();
		atributoCosmetico.setNombre("Atributo cosmetico de prueba");
		atributoCosmetico.setId(1);
		atributoCosmetico.setCategoriaAtributoCosmetico(CategoriaAtributo.Tienda);
		//System.out.println("Prueba Atributo cosmetico: " + atributoCosmetico.getCategoriaAtributoCosmetico());

		AtributoCosmetico propiedadCosmetica = new AtributoCosmetico();
		propiedadCosmetica.setPropiedadCosmetica(PropiedadCosmetica.Analgesico);

		AtributoCosmetico categoriaCosmetica = new AtributoCosmetico();
		categoriaCosmetica.setCategoriaCosmetica(CategoriaCosmetica.BombaBaño);

		AtributoCosmetico categoriaIngrediente = new AtributoCosmetico();
		categoriaIngrediente.setCategoriaIngrediente(CategoriaIngrediente.AceiteEsencial);

		AtributoCosmetico tienda = new AtributoCosmetico();
		tienda.setTienda(Tienda.Jabonarium);

		/*
		System.out.println("Prueba Atributos cosmeticos: ");
		System.out.println("PropiedadCosmetica: " + propiedadCosmetica.getPropiedadCosmetica());
		System.out.println("CategoriaCosmetica: " + categoriaCosmetica.getCategoriaCosmetica());
		System.out.println("CategoriaIngrediente: " + categoriaIngrediente.getCategoriaIngrediente());
		System.out.println("Tienda: " +tienda.getTienda());
*/
		

		Imagen etiquetaEimagen = new Imagen();
		etiquetaEimagen.setId(1);
		
	
		Receta receta = new Receta();
		receta.setId(1);
		
		//System.out.println("Receta de prueba: " +  receta);
		IngredienteReceta ingReceta = new IngredienteReceta();
		ingReceta.setPorcentaje(10);

		Producto producto = new Producto();
		List<AtributoCosmetico> propiedadesCosmeticas = new ArrayList<AtributoCosmetico>();
		List<Imagen> etiquetaEimagenes = new ArrayList<Imagen>();
		List<Receta>recetas= new ArrayList<Receta>();
		propiedadesCosmeticas.add(propiedadCosmetica);
		etiquetaEimagenes.add(etiquetaEimagen);
		recetas.add(receta);
		producto.setId(1);
		producto.setNombre("La bomba de espuma");
		producto.setAtributoCosmetico(propiedadesCosmeticas);
		producto.setCategoriaCosmetica(categoriaCosmetica);
		producto.setComentario("Soy un producto maravilloso");
		//producto.setEtiquetas(etiquetaEimagenes);
		System.out.println("Prueba producto: \n" + producto.getId() + " " + producto.getNombre() + " " + producto.getAtributoCosmetico() + producto.getCategoriaCosmetica()
		+ producto.getComentario() + producto.getEtiquetas() + producto.getImagenes() + producto.getRecetas());

		EtiquetaProducto etiqueta = new EtiquetaProducto();
		etiqueta.setId(1);
		//etiqueta.setImagen(pruebaBlob);
		etiqueta.setProducto(producto);
		System.out.println("Prueba EtiquetaProducto: " + etiqueta);

		ImagenProducto foto = new ImagenProducto();
		foto.setId(1);
		//foto.setImagen(pruebaBlob);
		foto.setProducto(producto);
		System.out.println("Prueba ImagenProducto" + foto);
		

		Ingrediente ingrediente = new Ingrediente();
		ingrediente.setId(1);
		ingrediente.setNombre("Aceite de coco");
		ingrediente.setComentario("Comentario del ingrediente");
		ingrediente.setCategoriaIngrediente(CategoriaIngrediente.AceiteEsencial);
		ingrediente.setAtributoCosmetico(propiedadesCosmeticas);
		ingrediente.setProducto(producto);
		System.out.println("Prueba Ingrediente: " + ingrediente);
		
		

	}

}
