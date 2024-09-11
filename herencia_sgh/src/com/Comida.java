package com;

import java.util.Arrays;

public class Comida {
	String Nombre;
	String tipo;
	String[] Ingredientes;
	String descripcion;
	
	public Comida() {
		
	}

	public Comida(String nombre, String tipo, String[] ingredientes, String descripcion) {
		super();
		Nombre = nombre;
		this.tipo = tipo;
		Ingredientes = ingredientes;
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String[] getIngredientes() {
		return Ingredientes;
	}

	public void setIngredientes(String[] ingredientes) {
		Ingredientes = ingredientes;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Comida [Nombre=" + Nombre + ", tipo=" + tipo + ", Ingredientes=" + Arrays.toString(Ingredientes)
				+ ", descripcion=" + descripcion + "]";
	}
	
	
}
