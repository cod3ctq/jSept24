package com;

public abstract class Deportista {

	String Entrenar;
	int Peso;
	String Dieta;
	
	public Deportista () {
		
	}

	public Deportista(String entrenar, int peso, String dieta) {
		super();
		Entrenar = entrenar;
		Peso = peso;
		Dieta = dieta;
	}

	public String getEntrenar() {
		return Entrenar;
	}

	public void setEntrenar(String entrenar) {
		Entrenar = entrenar;
	}

	public int getPeso() {
		return Peso;
	}

	public void setPeso(int peso) {
		Peso = peso;
	}

	public String getDieta() {
		return Dieta;
	}

	public void setDieta(String dieta) {
		Dieta = dieta;
	}

	@Override
	public String toString() {
		return "Deportista [Entrenar=" + Entrenar + ", Peso=" + Peso + ", Dieta=" + Dieta + "]";
	}

	public abstract void Entrenar ();

}
