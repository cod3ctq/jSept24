package com;

public class HotelCincoEstrellas extends Hotel {
	
	Comida comida;
	Boolean tieneAlberca;
	
	public HotelCincoEstrellas() {
		
	}

	public HotelCincoEstrellas(Comida comida, Boolean tieneAlberca) {
		super();
		this.comida = comida;
		this.tieneAlberca = tieneAlberca;
	}
	

	public Comida getComida() {
		return comida;
	}

	public void setComida(Comida comida) {
		this.comida = comida;
	}

	public Boolean getTieneAlberca() {
		return tieneAlberca;
	}

	public void setTieneAlberca(Boolean tieneAlberca) {
		this.tieneAlberca = tieneAlberca;
	}

	@Override
	public String toString() {
		return "HotelCincoEstrellas [comida=" + comida + ", tieneAlberca=" + tieneAlberca + ", Nombre=" + Nombre
				+ ", Direccion=" + Direccion + ", precioPorNoche=" + precioPorNoche + ", numHabitaciones="
				+ numHabitaciones + "]";
	}
	
	
}
