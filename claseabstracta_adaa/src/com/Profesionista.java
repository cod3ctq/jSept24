package com;

public abstract class Profesionista {
	public static void main(String[] args) {
		
	}
	String nombre;
	double salario;
	String carrera;
	
	public Profesionista() {
		
	}

	public Profesionista(String nombre, double salario, String carrera) {
		super();
		this.nombre = nombre;
		this.salario = salario;
		this.carrera = carrera;
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

	@Override
	public String toString() {
		return "Profesionista [nombre=" + nombre + ", salario=" + salario + ", carrera=" + carrera + "]";
	}
	
	public abstract void trabajar ();

}
