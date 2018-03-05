package com.alveares.ws.rest.service;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;

import com.alveares.ws.rest.vo.VOPedido;
//import com.alveares.ws.rest.vo.Producto;
@Path("/alveares")
public class ServicePedidoJR {

@POST	
@Path("/validarPedido")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})

	public VOPedido validaPedido(VOPedido vo) {
	vo.setEstadoPedido(false);
	
	if (vo.getCantidadProductos().intValue()<=5) {	
	
	System.out.println("*********************************");
	System.out.println("Pedido Resivido");
	System.out.println("*********************************");
	System.out.println("Nombre Solicitante :" +vo.getNombre());
	System.out.println("Tipo Identificacion :" +vo.getTipoId());
	System.out.println("Numero Identificacion :" +vo.getId());
	System.out.println("Cantidad Productos :" +vo.getCantidadProductos());
	System.out.println("Fecha y Hora Entrega :" +vo.getFechayHora());
	System.out.println("Direccion Entrega :" +vo.getDirEntrega());
	System.out.println("*********************************");
	vo.setEstadoPedido(true);
	
	}else 
	{
		System.out.println("*********************");
		System.out.println("Pedido Rechazado");
		System.out.println("*********************");
	}
		return vo;
	
}
}
