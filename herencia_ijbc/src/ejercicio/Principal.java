package ejercicio;

import com.Impresora;

public class Principal {
	public static void main(String[] args) {
		
		AlbaranCompra albC = new AlbaranCompra();
		Impresora imp = new Impresora();
		
		
		albC.setFechaPedido("10/12/2023");
		albC.setProveedor("Proveedor SA de CV");
		albC.setFolio("AL001");
		albC.setTotal(300.50);
		albC.setFechaEntrega("10/09/2024");
		albC.setCantEntregada(5);
		
		System.out.println(albC.toString());
		
		imp.setMarca("Epson");
		
	}
}
