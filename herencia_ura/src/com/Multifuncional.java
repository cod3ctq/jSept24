package com;

public class Multifuncional extends Inpresora {
	
	Escaner escaner;
	
	public Multifuncional() {
		
	}

	public Multifuncional(Escaner escaner) {
		super();
		this.escaner = escaner;
	}

	public Multifuncional(String marca, String modelo, String tipoInpresion, boolean color, Escaner escaner) {
		super(marca, modelo, tipoInpresion, color);
		this.escaner = escaner;
	}

	public Escaner getEscaner() {
		return escaner;
	}

	public void setEscaner(Escaner escaner) {
		this.escaner = escaner;
	}

	@Override
	public String toString() {
		return "Multifuncional [escaner=" + escaner + ", marca=" + marca + ", modelo=" + modelo + ", tipoInpresion="
				+ tipoInpresion + ", color=" + color + "]";
	}
	
	
	
	
	

}
