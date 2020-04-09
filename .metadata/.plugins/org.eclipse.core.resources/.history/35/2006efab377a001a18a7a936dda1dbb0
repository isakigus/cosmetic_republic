package curso.modelo.controlador;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import curso.modelo.entidad.Operacion;
import curso.modelo.negocio.GestorOperacion;

@Controller
public class ControladorOperacion {
	
	@Autowired
	private GestorOperacion go;
	
	
	@RequestMapping("calculadora")
		public String paginaCalculadora() {
		return "calculadora";
	}
	
	@RequestMapping("doOperacion")
	public ModelAndView hacerOperacion(@RequestParam("num1") int num1, @RequestParam("num2") int num2, @RequestParam("operador") String operador, ModelAndView mav) {
		
		Operacion op = new Operacion();
		
		op.setNum1(num1);
		op.setNum2(num2);
		op.setOperador(operador);
		
		go.operar(op);
  		  		
		mav.getModelMap().addAttribute("numero1", op.getNum1());
		mav.getModelMap().addAttribute("numero2", op.getNum2());
		mav.getModelMap().addAttribute("operador", op.getOperador());
		mav.getModelMap().addAttribute("resultado", op.getResultado());
		mav.setViewName("redirect:calculadora");
		return mav;
	}
	
	@RequestMapping("doTabla")
	public ModelAndView mostrarTabla(ModelAndView mav, @RequestParam(required = false) Integer id){
		List<Operacion> tablaOperaciones = go.listar();
		
		if(id != null) 
			
	
			mav.setViewName("calculadora");
			mav.addObject(go.listar());
			
			return mav;
		}
		
	
	}
	
	

