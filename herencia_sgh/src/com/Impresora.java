package com;

public class Impresora{
	String marca;
	String modelo;
	private String tipoImpresora;
	boolean color;

	public Impresora() {
		
	}
	//2- herencia Reutilizacion y absorcion de miebros
	//2- Especializacion
	public Impresora(String marca, String modelo, String tipoImpresora, boolean color) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.tipoImpresora = tipoImpresora;
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

	public String getTipoImpresora() {
		return tipoImpresora;
	}

	public void setTipoImpresora(String tipoImpresora) {
		this.tipoImpresora = tipoImpresora;
	}

	public boolean isColor() {
		return color;
	}

	public void setColor(boolean color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Impresora [marca=" + marca + ", modelo=" + modelo + ", tipoImpresora=" + tipoImpresora + ", color="
				+ color + "]";
	}
	
	public void imprimir()
	{
		System.out.println("Imprimiendo ..");
	}
	

}
