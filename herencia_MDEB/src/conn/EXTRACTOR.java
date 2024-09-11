package conn;

import java.util.Arrays;

public class EXTRACTOR {
	
	int tipoMolino;
	String tipoDeFiltro;
	int velocidades;
	
	
	public EXTRACTOR() {
	
	}


	public EXTRACTOR(int tipoMolino, String tipoDeFiltro, int velocidades) {
		super();
		this.tipoMolino = tipoMolino;
		this.tipoDeFiltro = tipoDeFiltro;
		this.velocidades = velocidades;
	}


	public int getTipoMolino() {
		return tipoMolino;
	}


	public void setTipoMolino(int tipoMolino) {
		this.tipoMolino = tipoMolino;
	}


	public String getTipoDeFiltro() {
		return tipoDeFiltro;
	}


	public void setTipoDeFiltro(String tipoDeFiltro) {
		this.tipoDeFiltro = tipoDeFiltro;
	}


	public int getVelocidades() {
		return velocidades;
	}


	public void setVelocidades(int velocidades) {
		this.velocidades = velocidades;
	}


	@Override
	public String toString() {
		return "EXTRACTOR [tipoMolino=" + tipoMolino + ", tipoDeFiltro=" + tipoDeFiltro + ", velocidades=" + velocidades
				+ ", getTipoMolino()=" + getTipoMolino() + ", getTipoDeFiltro()=" + getTipoDeFiltro()
				+ ", getVelocidades()=" + getVelocidades() + "]";
	}
	
	
	

}
