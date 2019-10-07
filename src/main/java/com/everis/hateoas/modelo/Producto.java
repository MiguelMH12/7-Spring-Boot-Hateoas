package com.everis.hateoas.modelo;

import org.springframework.hateoas.ResourceSupport;

//Rutas de Hateoas heredar de la clase ResourceSupport
public class Producto extends ResourceSupport{
	
	private int  idProducto;
	private String nombre;
	
	public Producto(int id, String nombre) {
		this.idProducto	 = id;
		this.nombre = nombre;
	}

	public int getIdProducto() {
		return idProducto;
	}



	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
