package com;

public class Medico extends Profesionista {
	public Medico () {
		
	}

	@Override
	public String toString() {
		return "Medico [nombre=" + nombre + ", salario=" + salario + ", carrera=" + carrera + ", getNombre()="
				+ getNombre() + ", getSalario()=" + getSalario() + ", getCarrera()=" + getCarrera() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	@Override
	public void trabajar() {
		// TODO Auto-generated method stub
		
	}

}
