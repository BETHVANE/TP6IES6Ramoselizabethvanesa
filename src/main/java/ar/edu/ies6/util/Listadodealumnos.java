package ar.edu.ies6.util;

import java.util.ArrayLits;
import java.util.List;
import ar.edu.ies6.model.Alumno;


public class Listadodealumnos {
	private static List <Alumno> Listado= new ArrayLits<> ();
	public Listadodealumnos() {
		// TODO Auto-generated constructor stub
	}
	public static List<Alumno> getListado() {
		return Listado;
	}
	public static void setListado(List<Alumno> listado) {
		Listado = listado;
	}
	
	

}
