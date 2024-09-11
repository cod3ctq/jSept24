package com;

public class Multifuncional extends Impresora {
//HERENCIA. Palabra clave "extends"
	
	Escaner escan;//Se crea una variable de tipo Escaner, que es una clase con mas variables

	public Multifuncional() {
		
	}

	public Multifuncional(Escaner escan) {
		super();
		this.escan = escan;
	}

	public Multifuncional(String marca, String modelo, String tipImpres, boolean impriColor, Escaner escan) {
		super(marca, modelo, tipImpres, impriColor);
		this.escan = escan;
	}

	@Override
	public String toString() {
		return "Multifuncional [escan=" + escan + ", marca=" + marca + ", modelo=" + modelo + ", tipImpres=" + tipImpres
				+ ", impriColor=" + impriColor + "]";
	}

	
	
	
}

