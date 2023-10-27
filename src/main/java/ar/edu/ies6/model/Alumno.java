package ar.edu.ies6.model;

import java.time.LocalDate;
import java.time.Period;

@component
public class Alumno {
	private String name;
	private String lastName;
	private String addressStreet;
	private String addressNumber;
	private LocalDate fechaNac;
	private Boolean estado;
	
public Alumno() {
	// TODO Auto-generated constructor stub
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getAddressStreet() {
	return addressStreet;
}

public void setAddressStreet(String addressStreet) {
	this.addressStreet = addressStreet;
}

public String getAddressNumber() {
	return addressNumber;
}

public void setAddressNumber(String addressNumber) {
	this.addressNumber = addressNumber;
}

public LocalDate getFechaNac() {
	return fechaNac;
}

public void setFechaNac(LocalDate fechaNac) {
	this.fechaNac = fechaNac;
}

public boolean isEstado() {
	return estado;
}

public void setEstado(boolean estado) {
	this.estado = estado;
}

public Integer getEdad () {
	//TODO calcularEdad
		int edad=0;
	//LocalDate fechaN= fechaNac.toInstant ().atZone (ZoneId.systemDefault()).toLocalDate();
		LocalDate fechaActual = LocalDate.now();
	Period periodo= Period.between (fechaNac, fechaActual);
			edad=periodo.getYears();
	return edad;
	}
	

}
