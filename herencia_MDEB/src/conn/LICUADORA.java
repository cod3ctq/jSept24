package conn;

public class LICUADORA {
	
	String marca;
	String modelo;
	int potencia;
	int capacidad;
	int voltaje;
	
	
	public LICUADORA () {
		
		
	}


	public LICUADORA(String marca, String modelo, int potencia, int capacidad, int voltaje) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.potencia = potencia;
		this.capacidad = capacidad;
		this.voltaje = voltaje;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getPotencia() {
		return potencia;
	}


	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}


	public int getCapacidad() {
		return capacidad;
	}


	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}


	public int getVoltaje() {
		return voltaje;
	}


	public void setVoltaje(int voltaje) {
		this.voltaje = voltaje;
	}


	@Override
	public String toString() {
		return "LICUADORA [marca=" + marca + ", modelo=" + modelo + ", potencia=" + potencia + ", capacidad="
				+ capacidad + ", voltaje=" + voltaje + "]";
	}
		

}
