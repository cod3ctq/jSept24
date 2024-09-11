package com;

public class Arquitecto extends Profesionista {
	
	public Arquitecto () {
		
	}
	
	@Override
	public String toString() {
		return "Arquitecto [nombre=" + nombre + ", salario=" + salario + ", carrera=" + carrera + ", añosExp=" + añosExp
				+ ", getNombre()=" + getNombre() + ", getSalario()=" + getSalario() + ", getCarrera()=" + getCarrera()
				+ ", getAñosExp()=" + getAñosExp() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	@Override
	public void trabajar() {
		// TODO Auto-generated method stub
		
	}
	
	
}
