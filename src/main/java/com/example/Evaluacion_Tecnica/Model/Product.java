package com.example.Evaluacion_Tecnica.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Product")
public class Product {
	
	@Getter @Setter @Column(name= "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
    private Long id;
	
	
	@Getter @Setter @Column(name= "identificación")
    private String identificacion;

	
	
	@Getter @Setter @Column(name= "nombre")
    private String nombre;
	
	@Getter @Setter @Column(name= "precio")
    private int precio;

	
	@Getter @Setter @Column(name= "disponibilidad")
    private Boolean disponibilidad;


	public Long getId() {
		return id;
	}


	public String getIdentificacion() {
		return identificacion;
	}


	public String getNombre() {
		return nombre;
	}


	public int getPrecio() {
		return precio;
	}


	public Boolean getDisponibilidad() {
		return disponibilidad;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public void setDisponibilidad(Boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	
	
	
}
