package com;

public class CamaraDigital extends CamaraAnaloga {

	double bateria;
	int pantalla;
	int almacenamiento;

	public CamaraDigital () {
		
	}

	public CamaraDigital(String lente, int peso, boolean flash, double bateria, int pantalla, int almacenamiento) {
		super(lente, peso, flash);
		this.bateria = bateria;
		this.pantalla = pantalla;
		this.almacenamiento = almacenamiento;
	}

	public double getBateria() {
		return bateria;
	}

	public void setBateria(double bateria) {
		this.bateria = bateria;
	}

	public int getPantalla() {
		return pantalla;
	}

	public void setPantalla(int pantalla) {
		this.pantalla = pantalla;
	}

	public int getAlmacenamiento() {
		return almacenamiento;
	}

	public void setAlmacenamiento(int almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	@Override
	public String toString() {
		return "CamaraDigital [bateria=" + bateria + ", pantalla=" + pantalla + ", almacenamiento=" + almacenamiento
				+ ", lente=" + lente + ", peso=" + peso + ", flash=" + flash + "]";
	}
	
}
