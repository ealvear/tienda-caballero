package com.alveares.ws.rest.vo;


public class VOPedido {
	private String  nombre;
	private String  tipoId;	
	private Number  id;
	private String  tipoProductos;
	private Number  cantidadProductos;
	private Number  precioTotal	;
	private String  fechayHora;
	private String dirEntrega;
	private boolean estadoPedido;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
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
	public String getTipoProductos() {
		return tipoProductos;
	}
	public void setTipoProductos(String tipoProductos) {
		this.tipoProductos = tipoProductos;
	}
	public Number getCantidadProductos() {
		return cantidadProductos;
	}
	public void setCantidadProductos(Number cantidadProductos) {
		this.cantidadProductos = cantidadProductos;
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
	public boolean isEstadoPedido() {
		return estadoPedido;
	}
	public void setEstadoPedido(boolean estadoPedido) {
		this.estadoPedido = estadoPedido;
	}
		
	
		
	
}
