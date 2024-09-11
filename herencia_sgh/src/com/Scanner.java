package com;

import java.util.Arrays;

public class Scanner {
	int ppi;
	String[] formato;
	double areaEscaneo;

	public Scanner() {
	}

	public Scanner(int ppi, String[] formato, double areaEscaneo) {
		super();
		this.ppi = ppi;
		this.formato = formato;
		this.areaEscaneo = areaEscaneo;
	}

	public int getPpi() {
		return ppi;
	}

	public void setPpi(int ppi) {
		this.ppi = ppi;
	}

	public String[] getFormato() {
		return formato;
	}

	public void setFormato(String[] formato) {
		this.formato = formato;
	}

	public double getAreaEscaneo() {
		return areaEscaneo;
	}

	public void setAreaEscaneo(double areaEscaneo) {
		this.areaEscaneo = areaEscaneo;
	}

	@Override
	public String toString() {
		return "Scanner [ppi=" + ppi + ", formato=" + Arrays.toString(formato) + ", areaEscaneo=" + areaEscaneo + "]";
	}
	
	
}
