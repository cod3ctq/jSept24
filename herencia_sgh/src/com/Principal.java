package com;

public class Principal {
	public static void main(String[] args) {
		Impresora imp = new Impresora();
		Multifuncional m1 = new Multifuncional();
		m1.imprimir();
		imp.imprimir();
		System.out.println(imp);
	}
}
