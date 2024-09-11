package com;

import java.util.Arrays;
public class Multifuncional  extends Impresora{
	
	
	
		
		
		Escaner escan;
		
		public Multifuncional() {
		}
		public Multifuncional(Escaner escan) {
			super();
			this.escan = escan;	
		}
		public Escaner getEscan() {
			return escan;
		}
		public void setEscan(Escaner escan) {
			this.escan = escan;
		}
		@Override
		public String toString() {
			return "Multifuncional [escan=" + escan + ", marca=" + marca + ", modelo=" + modelo + ", tipoImpresion="
					+ tipoImpresion + ", color=" + color + "]";
		}
		
		
		

		
	}
	


