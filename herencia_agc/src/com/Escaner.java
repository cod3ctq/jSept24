package com;

public class Escaner {
	
	int ppi;
	String[] formatos;
	double areaEscaneo;
	
	public Escaner(){
		
	}

	public Escaner(int ppi, String[] formatos, double areaEscaneo) {
		super();
		this.ppi = ppi;
		this.formatos = formatos;
		this.areaEscaneo = areaEscaneo;
	}

	public int getPpi() {
		return ppi;
	}

	public void setPpi(int ppi) {
		this.ppi = ppi;
	}

	public String[] getFormatos() {
		return formatos;
	}

	public void setFormatos(String[] formatos) {
		this.formatos = formatos;
	}

	public double getAreaEscaneo() {
		return areaEscaneo;
	}

	public void setAreaEscaneo(double areaEscaneo) {
		this.areaEscaneo = areaEscaneo;
	}

	@Override
	public String toString() {
		return "Escaner [ppi=" + ppi + ", areaEscaneo=" + areaEscaneo + "]";
	}

}
