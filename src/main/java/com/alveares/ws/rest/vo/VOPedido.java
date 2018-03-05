package com.alveares.ws.rest.vo;

//import java.util.List;

public class VOPedido {
	private String  nombre;
	private String  tipoId;	
	private Number  id;
	private String  tipoProducto;
	private Number  cantidadProductos;
//	private List<Producto> Productos;
	private Number  precioTotal	;
	private String  fechayHora;
	private String dirEntrega;
	private boolean estadoPedido;
	
	
	public VOPedido() {
		
	}
	
	public VOPedido(String nombre, String tipoId, Number id, Number numeroProductos, Number precioTotal,
			String fechayHora, String dirEntrega, boolean estadoPedido) {
		super();
		this.nombre = nombre;
		this.tipoId = tipoId;
		this.id = id;
		this.cantidadProductos = numeroProductos;
		this.precioTotal = precioTotal;
		this.fechayHora = fechayHora;
		this.dirEntrega = dirEntrega;
		this.estadoPedido = estadoPedido;
	}
	public boolean isEstadoPedido() {
		return estadoPedido;
	}
	public void setEstadoPedido(boolean estadoPedido) {
		this.estadoPedido = estadoPedido;
	}
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
//	
//	public List<Producto> getProductos() {
//		return Productos;
//	}
//	public void setProductos(List<Producto> productos) {
//		Productos = productos;
//	}
	public String getTipoId() {
		return tipoId;
	}
	public void setTipoId(String tipoId) {
		this.tipoId = tipoId;
	}
	public Number getId() {
		return id;
	}
	public void setId(Number id) {
		this.id = id;
	}
	public Number getCantidadProductos() {
		return cantidadProductos;
	}
	public void setCantidadProductos(Number numeroProductos) {
		this.cantidadProductos = numeroProductos;
	}
	public Number getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(Number precioTotal) {
		this.precioTotal = precioTotal;
	}
	public String getFechayHora() {
		return fechayHora;
	}
	public void setFechayHora(String fechayHora) {
		this.fechayHora = fechayHora;
	}
	public String getDirEntrega() {
		return dirEntrega;
	}
	public void setDirEntrega(String dirEntrega) {
		this.dirEntrega = dirEntrega;
	}
	
		
	
}
