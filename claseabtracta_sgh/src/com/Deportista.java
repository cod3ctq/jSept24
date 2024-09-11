package com;

public abstract class Deportista {
	
	String nombre;
	String diciplina;
	
	public Deportista() {
		
	}
	
	public abstract void entrenar();

	public Deportista(String nombre, String diciplina) {
		super();
		this.nombre = nombre;
		this.diciplina = diciplina;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDiciplina() {
		return diciplina;
	}

	public void setDiciplina(String diciplina) {
		this.diciplina = diciplina;
	}

	@Override
	public String toString() {
		return "Deportista [nombre=" + nombre + ", diciplina=" + diciplina + "]";
	}
	
}
