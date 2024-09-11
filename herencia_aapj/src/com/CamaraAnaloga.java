package com;

public class CamaraAnaloga {

	String lente;
	int peso;
	boolean flash;

	public CamaraAnaloga() {
		
	}

	public CamaraAnaloga(String lente, int peso, boolean flash) {
		super();
		this.lente = lente;
		this.peso = peso;
		this.flash = flash;
	}

	public String getLente() {
		return lente;
	}

	public void setLente(String lente) {
		this.lente = lente;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public boolean isFlash() {
		return flash;
	}

	public void setFlash(boolean flash) {
		this.flash = flash;
	}

	@Override
	public String toString() {
		return "CamaraAnaloga [lente=" + lente + ", peso=" + peso + ", flash=" + flash + "]";
	}


}
