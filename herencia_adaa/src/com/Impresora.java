package com;

public class Impresora {

	String marca;
	String modelo;
	String tipoImpresion;
	boolean color;
	
	public Impresora() {
		
		
	}

	public Impresora(String marca, String modelo, String tipoImpresion, boolean color) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.tipoImpresion = tipoImpresion;
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

	public String getTipoImpresion() {
		return tipoImpresion;
	}

	public void setTipoImpresion(String tipoImpresion) {
		this.tipoImpresion = tipoImpresion;
	}

	public boolean isColor() {
		return color;
	}

	public void setColor(boolean color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "impresora [marca=" + marca + ", modelo=" + modelo + ", tipoImpresion=" + tipoImpresion + ", color="
				+ color + "]";
		
	}
	public void imprimir() {
		System.out.println("Imprimiendo...");
	}
}
