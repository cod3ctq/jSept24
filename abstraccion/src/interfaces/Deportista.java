package interfaces;

public abstract class Deportista {
	
	String nombre;
	int edad;
	
	public Deportista() {
		
	}
	
	public Deportista(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Deportista [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	public abstract void entrenar();

}
