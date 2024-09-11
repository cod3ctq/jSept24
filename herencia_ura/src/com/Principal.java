package com;

public class Principal {
	
	public static void main(String[] args) {
		
		Inpresora in1=new Inpresora();
		Multifuncional m1=new Multifuncional();
		
		in1.setColor(true);
		in1.setMarca("Samsumg");
		in1.setModelo("CS)23");
		in1.setTipoInpresion("Nuevo");
		
		System.out.println(in1.toString());
		in1.inprimir();
		
		System.out.println(m1.toString());
		
	}

}
