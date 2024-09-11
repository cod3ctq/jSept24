package com;

public class Multifuncional extends Impresora{
	Scanner escan;
	
	
	public Multifuncional() {
		
	}


	public Multifuncional(Scanner escan) {
		super();
		this.escan = escan;
	}


	public Scanner getEscan() {
		return escan;
	}


	public void setEscan(Scanner escan) {
		this.escan = escan;
	}




	@Override
	public String toString() {
		return "Multifuncional [escan=" + escan + ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo()
				+ ", getTipoImpresora()=" + getTipoImpresora() + ", isColor()=" + isColor() + ", toString()="
				+ super.toString() + "]";
	}


	public Multifuncional(String marca, String modelo, String tipoImpresora, boolean color, Scanner escan) {
		super(marca, modelo, tipoImpresora, color);
		this.escan = escan;
	}
	
	
}
