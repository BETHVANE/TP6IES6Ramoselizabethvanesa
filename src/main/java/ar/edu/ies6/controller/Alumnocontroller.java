package ar.edu.ies6.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.ies6.model.*;

@Controller
public class Alumnocontroller {
	@GetMapping({"/index","/","home","/alumno"})
	public ModelAndView cargarAlumno() {
		Alumno alu= new Alumno ();
		alu.setfechaNac(LocalDate.of(1988, 5, 14));
		System.out.println("edad:"*alu.getedad());
		ModelAndView modelView= new ModelAndView("index");
		modelView.addObject("Alumno",alu);
		return modelView;
	}
		
		
		
	
		@PostMapping("/cargarAlumno")
		public ModelAndView cargarAlumno(@ModelAttribute("alumno")Alumno alumno) {
			
			Listado.add(alumno);
			ModelAndView modelView=new ModelAndView("listadodealumno");
		
			modelView.addObject("listado", listado);
			return modelView;
		}
		
	}

	
	
	
	
}
