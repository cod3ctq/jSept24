package com;

public abstract class Deportista {
	
	String nombre;
	int edad; 
	String posicion;
	
	public Deportista() {
		
	}

	public Deportista(String nombre, int edad, String posicion) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	@Override
	public String toString() {
		return "Deportista [nombre=" + nombre + ", edad=" + edad + ", posicion=" + posicion + "]";
	}
	
	public abstract void entrenar();
	
	

}
