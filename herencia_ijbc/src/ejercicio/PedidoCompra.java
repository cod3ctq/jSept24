package ejercicio;

public class PedidoCompra {
	
	String proveedor,fechaPedido,folio;
	double total;
	
	public PedidoCompra() {
		
	}
	
	public PedidoCompra(String proveedor, String fechaPedido, String folio, double total) {
		super();
		this.proveedor = proveedor;
		this.fechaPedido = fechaPedido;
		this.folio = folio;
		this.total = total;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	public String getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(String fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public String getFolio() {
		return folio;
	}

	public void setFolio(String folio) {
		this.folio = folio;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "PedidoCompra [proveedor=" + proveedor + ", fechaPedido=" + fechaPedido + ", folio=" + folio + ", total="
				+ total + "]";
	}
	
	
	
	

}
