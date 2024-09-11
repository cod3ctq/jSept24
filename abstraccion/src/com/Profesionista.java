package com;

public abstract class Profesionista {
	String nombre,carrera;
	double salario;
	int experienceAnos;
	
	public Profesionista() {
		
	}
	
	public Profesionista(String nombre, String carrera, double salario, int experienceAnos) {
		super();
		this.nombre = nombre;
		this.carrera = carrera;
		this.salario = salario;
		this.experienceAnos = experienceAnos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getExperienceAnos() {
		return experienceAnos;
	}

	public void setExperienceAnos(int experienceAnos) {
		this.experienceAnos = experienceAnos;
	}

	@Override
	public String toString() {
		return "Profesionista [nombre=" + nombre + ", carrera=" + carrera + ", salario=" + salario + ", experienceAnos="
				+ experienceAnos + "]";
	}
	
	
	//Metodo ABSTRACTO
	public abstract void trabajar();
	
	
	

}
