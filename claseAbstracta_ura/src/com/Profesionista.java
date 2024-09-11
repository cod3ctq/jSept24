package com;

public abstract class Profesionista {
	
	String nombre;
	double salario;
	String carrera;
	int experiencia;
	
	public Profesionista() {
		
	}

	public Profesionista(String nombre, double salario, String carrera, int experiencia) {
		this.nombre = nombre;
		this.salario = salario;
		this.carrera = carrera;
		this.experiencia = experiencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public String toString() {
		return "Profesionista [nombre=" + nombre + ", salario=" + salario + ", carrera=" + carrera + ", experiencia="
				+ experiencia + "]";
	}
	
	public abstract void trabajar();

}
