package com;

public abstract class Profesionista {
	
	String nombre;
	double salario;
	String carrera;
	int añosExp;
	
	
	public Profesionista (){
		
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

	public int getAñosExp() {
		return añosExp;
	}

	public void setAñosExp(int añosExp) {
		this.añosExp = añosExp;
	}

	public Profesionista(String nombre, double salario, String carrera, int añosExp) {
		super();
		this.nombre = nombre;
		this.salario = salario;
		this.carrera = carrera;
		this.añosExp = añosExp;
	}

	public abstract void trabajar(String lugar);
	
	public abstract int cobrar(int sueldoxh, int horas);

	public void trabajar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Profesionista [nombre=" + nombre + ", salario=" + salario + ", carrera=" + carrera + ", añosExp="
				+ añosExp + "]";
	}
}
