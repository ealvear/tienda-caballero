package com.alveares.ws.rest.vo;

public class Producto {

	private Number id;
	private String nombre;
	private Number precio;
	private Number cantidad;

	public Producto() {
		
	}
	
	public Producto(Number id, String nombre, Number precio, Number cantidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public Number getId() {
		return id;
	}

	public void setId(Number id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Number getPrecio() {
		return precio;
	}

	public void setPrecio(Number precio) {
		this.precio = precio;
	}

	public Number getCantidad() {
		return cantidad;
	}

	public void setCantidad(Number cantidad) {
		this.cantidad = cantidad;
	}

}
