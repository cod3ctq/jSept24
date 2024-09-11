package com;

public class Arquitecto extends Profesionista{
	
	public Arquitecto() {
		
	}
	
	public Arquitecto(String nombre, double salario, String carrera, int experiencia) {
		super(nombre,salario,carrera,experiencia);
	}
	
	

	@Override
	public void trabajar() {
		
		System.out.println("Supervisa la hobra.\n"
				+ "Disena y planifica.\n"
				+ "Gestionar proyectos.\n"
				+ "Consultoria y asesoramiento.");
		
	}

}
