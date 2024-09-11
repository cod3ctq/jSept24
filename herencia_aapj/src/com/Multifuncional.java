package com;

public class Multifuncional extends Impresora  {
	
	Escaner escan;
	
	public Multifuncional () {
		
	}

	public Multifuncional(Escaner escan) {
		super();
		this.escan = escan;
	}

	public Multifuncional(String marca, String modelo, String tipoImpresion, boolean color, Escaner escan) {
		super(marca, modelo, tipoImpresion, color);
		this.escan = escan;
	}

	public Escaner getEscan() {
		return escan;
	}

	public void setEscan(Escaner escan) {
		this.escan = escan;
	}

	@Override
	public String toString() {
		return "Multifuncional [escan=" + escan + ", marca=" + marca + ", modelo=" + modelo + ", tipoImpresion="
				+ tipoImpresion + ", color=" + color + "]";
	}

	
}
