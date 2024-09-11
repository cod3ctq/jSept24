package ejercicio;

public class AlbaranCompra extends PedidoCompra {

	String fechaEntrega;
	int cantEntregada;
	
	public AlbaranCompra(){
		
	}

	public AlbaranCompra(String fechaEntrega, int cantEntregada) {
		super();
		this.fechaEntrega = fechaEntrega;
		this.cantEntregada = cantEntregada;
	}

	public AlbaranCompra(String proveedor, String fechaPedido, String folio, double total, String fechaEntrega,
			int cantEntregada) {
		super(proveedor, fechaPedido, folio, total);
		this.fechaEntrega = fechaEntrega;
		this.cantEntregada = cantEntregada;
	}

	
	public String getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(String fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public int getCantEntregada() {
		return cantEntregada;
	}

	public void setCantEntregada(int cantEntregada) {
		this.cantEntregada = cantEntregada;
	}

	@Override
	public String toString() {
		return "AlbaranCompra [fechaEntrega=" + fechaEntrega + ", cantEntregada=" + cantEntregada + ", proveedor="
				+ proveedor + ", fechaPedido=" + fechaPedido + ", folio=" + folio + ", total=" + total + "]";
	}

	


}
