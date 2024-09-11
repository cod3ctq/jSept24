package com;

public class Coche {
	   
	String marca;
	String modelo;
	String asientos;
	boolean color;
	    
	public Coche() {
	
	
	}

	public Coche(String marca, String modelo, String asientos, boolean color) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.asientos = asientos;
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAsientos() {
		return asientos;
	}

	public void setAsientos(String asientos) {
		this.asientos = asientos;
	}

	public boolean isColor() {
		return color;
	}

	public void setColor(boolean color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", asientos=" + asientos + ", color=" + color + "]";
	}
	
	
	
	
}

	

