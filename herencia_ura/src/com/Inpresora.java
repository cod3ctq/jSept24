package com;

public class Inpresora {
	
	String marca;
	String modelo;
	String tipoInpresion;
	boolean color;
	
	public Inpresora() {
		
	}

	public Inpresora(String marca, String modelo, String tipoInpresion, boolean color) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.tipoInpresion = tipoInpresion;
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

	public String getTipoInpresion() {
		return tipoInpresion;
	}

	public void setTipoInpresion(String tipoInpresion) {
		this.tipoInpresion = tipoInpresion;
	}

	public boolean isColor() {
		return color;
	}

	public void setColor(boolean color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Inpresora [marca=" + marca + ", modelo=" + modelo + ", tipoInpresion=" + tipoInpresion + ", color="
				+ color + "]";
	}
	
	public void inprimir() {
		System.out.println("Inprimiendo..................");
	}

}
