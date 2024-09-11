package com;

public class Perro extends Animal {
	
	String raza;
	
	public Perro() {
		
	}

	public Perro(String raza) {
		super();
		this.raza = raza;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public String toString() {
		return "Perro [raza=" + raza + "]";
	}
	
	

}
