package com;

public class PRINCIPAL {

	public static void main(String[] args) {

	
	ARQUITECTO a1= new ARQUITECTO("URIEL RAMIREZ");
	System.out.println(a1.toString());
	a1.trabajar();
	
	medico m1= new medico();
	System.out.println(m1.toString());
	m1.trabajar();
	}
}
