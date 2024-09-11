package com;

public class Medico extends Profesionista{

	public Medico() {
		
	}
	
	public Medico(String nombre, double salario, String carrera, int experiencia) {
		super(nombre,salario,carrera,experiencia);
	}
	
	@Override
	public void trabajar() {
		
		System.out.println("Consulta.\n"
				+ "Medica.\n"
				+ "Solicita examenes.\n"
				+ "Registra datos.");
		
	}
	

}
