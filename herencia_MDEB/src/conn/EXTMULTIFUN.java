package conn;



	import com.Escaner;
import com.Impresora;
	public class EXTMULTIFUN  extends LICUADORA{
		
		
		
		EXTRACTOR extrac;
		
		public EXTMULTIFUN() {
		}
		public EXTMULTIFUN(EXTRACTOR extrac) {
			super();
			this.extrac = extrac;	
		}
		public EXTRACTOR getEscan() {
			return extrac;
		}
		public void setEscan(EXTRACTOR extrac) {
			this.extrac = extrac;
		}
		@Override
		public String toString() {
			return "EXTMULTIFUN [extrac=" + extrac + ", marca=" + marca + ", modelo=" + modelo + ", potencia="
					+ potencia + ", capacidad=" + capacidad + ", voltaje=" + voltaje + ", getEscan()=" + getEscan()
					+ ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo() + ", getPotencia()=" + getPotencia()
					+ ", getCapacidad()=" + getCapacidad() + ", getVoltaje()=" + getVoltaje() + ", toString()="
					+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
		}
		
		
		
		
		
		
	
}
