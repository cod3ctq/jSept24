package com;

public class Principal {
	
	public static void main(String[] args) {
		
		Arquitecto a1=new Arquitecto("Uriel Ramirez Arellano", 55000, "Informatica", 3);
		System.out.println(a1.toString());
    	a1.trabajar();
		
    	System.out.println("\n");
    	
		Medico m1=new Medico("Daniel", 65000, "Enfermeria", 8);
		System.out.println(m1.toString());
		m1.trabajar();
		
	}
	


}
