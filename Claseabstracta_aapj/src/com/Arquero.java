package com;

public abstract class Arquero extends Deportista {

	String Equipo;
	double Long;
	
	public Arquero () {
		
	}

	public Arquero(String equipo, double l) {
		super();
		Equipo = equipo;
		Long = l;
	}

	public Arquero(String entrenar, int peso, String dieta, String equipo, double l) {
		super(entrenar, peso, dieta);
		Equipo = equipo;
		Long = l;
	}

	public String getEquipo() {
		return Equipo;
	}

	public void setEquipo(String equipo) {
		Equipo = equipo;
	}

	public double getLong() {
		return Long;
	}

	public void setLong(double l) {
		Long = l;
	}

	@Override
	public String toString() {
		return "Arquero [Equipo=" + Equipo + ", Long=" + Long + ", Entrenar=" + Entrenar + ", Peso=" + Peso + ", Dieta="
				+ Dieta + "]";
	}


}
