package com;

public class Hotel {
	String Nombre;
	String Direccion;
	double precioPorNoche;
	Integer numHabitaciones;
	
	public Hotel() {
		
	}
	//encapsulamiento  es un concepto para delimitar los accesos y visivilidad de los miembos de una clase
	public Hotel(String nombre, String direccion, double precioPorNoche, Integer numHabitaciones) {
		super();
		Nombre = nombre;
		Direccion = direccion;
		this.precioPorNoche = precioPorNoche;
		this.numHabitaciones = numHabitaciones;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public double getPrecioPorNoche() {
		return precioPorNoche;
	}

	public void setPrecioPorNoche(double precioPorNoche) {
		this.precioPorNoche = precioPorNoche;
	}

	public Integer getNumHabitaciones() {
		return numHabitaciones;
	}

	public void setNumHabitaciones(Integer numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}

	@Override
	public String toString() {
		return "Hotel [Nombre=" + Nombre + ", Direccion=" + Direccion + ", precioPorNoche=" + precioPorNoche
				+ ", numHabitaciones=" + numHabitaciones + "]";
	}
	
	
	
	
}

