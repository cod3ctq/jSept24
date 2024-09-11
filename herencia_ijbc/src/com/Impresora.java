package com;


//SUPER CLASE es Object
public class Impresora {
	
	String marca,modelo,tipImpres;
	boolean impriColor;
	
	public Impresora() {
		
	}

	public Impresora(String marca, String modelo, String tipImpres, boolean impriColor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.tipImpres = tipImpres;
		this.impriColor = impriColor;
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

	public String getTipImpres() {
		return tipImpres;
	}

	public void setTipImpres(String tipImpres) {
		this.tipImpres = tipImpres;
	}

	public boolean isImpriColor() {
		return impriColor;
	}

	public void setImpriColor(boolean impriColor) {
		this.impriColor = impriColor;
	}

	@Override
	public String toString() {
		return "Impresora [marca=" + marca + ", modelo=" + modelo + ", tipImpres=" + tipImpres + ", impriColor="
				+ impriColor + "]";
	}
	
	public void imprimir() {
		System.out.println("Imprimiendo...");
	}
	
	
	
}
