package com;

	public abstract class Deportista {
			
			String nombre;
			double salario;
			int edad;
			
			public Deportista() {
				
			}
			
			public Deportista(String nombre, double salario, int edad) {
				super();
				this.nombre = nombre;
				this.salario = salario;
				this.edad = edad;
			}

			public String getNombre() {
				return nombre;
			}

			public void setNombre(String nombre) {
				this.nombre = nombre;
			}

			public double getSalario() {
				return salario;
			}

			public void setSalario(double salario) {
				this.salario = salario;
			}

			public int getEdad() {
				return edad;
			}

			public void setEdad(int edad) {
				this.edad = edad;
			}

			@Override
			public String toString() {
				return "Deportista [nombre=" + nombre + ", salario=" + salario + ", edad=" + edad + "]";
			}
			
			public abstract void entrenar();
			
			
		

		
		
	}
