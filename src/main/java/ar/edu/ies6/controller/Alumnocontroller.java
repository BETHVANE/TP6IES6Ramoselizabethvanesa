package ar.edu.ies6.controller;

import ar.edu.ies6.model.Alumno;
import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.ies6.model.*;
 
@Controller
public class Alumnocontroller {
	@GetMapping({"/index","/","home","/alumno"})
	public ModelAndView cargarAlumno() {
		Alumno alu= new Alumno();
		alu.setFechaNac(LocalDate.of(1988, 6,15));
		System.out.println("Edad:"+alu.getEdad());
		ModelAndView modelView= new ModelAndView("index");
		modelView.addObject("Alumno",alu);
		return modelView;
	}
		
		
		
	
		@PostMapping("/cargarAlumno")
		public ModelAndView cargarAlumno(@ModelAttribute("Alumno")Alumno alumno) {
			
			ModelAndView modelView=new ModelAndView("listadodealumno");
		modelView.addObject("listadodealumno", listado);
			return modelView;
		}
		
	}

	
	
	
	
}
