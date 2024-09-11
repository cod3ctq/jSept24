package com;

import java.util.Arrays;

public class Escaner {
	
	int px;
	String [] formatos;
	double areaScaner;

	
	public Escaner(){
		
	}


	public Escaner(int px, String[] formatos, double areaScaner) {
		super();
		this.px = px;
		this.formatos = formatos;
		this.areaScaner = areaScaner;
	}


	public int getPx() {
		return px;
	}


	public void setPx(int px) {
		this.px = px;
	}


	public String[] getFormatos() {
		return formatos;
	}


	public void setFormatos(String[] formatos) {
		this.formatos = formatos;
	}


	public double getAreaScaner() {
		return areaScaner;
	}


	public void setAreaScaner(double areaScaner) {
		this.areaScaner = areaScaner;
	}


	@Override
	public String toString() {
		return "Escaner [px=" + px + ", formatos=" + Arrays.toString(formatos) + ", areaScaner=" + areaScaner + "]";
	}
	
	
	
}
