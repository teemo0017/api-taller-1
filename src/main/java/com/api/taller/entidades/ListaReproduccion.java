package com.api.taller.entidades;

import javax.persistence.*;


@Entity
@Table(name="reproduciones")
public class ListaReproduccion {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	@Column(name="nombre")
	private String name;
	@Column(name="descripcion")
	private String description;

	@ManyToOne
    @JoinColumn(name="cancion")
	private Cancion cancion;


	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Cancion getCancion() {
		return cancion;
	}
	public void setCancion(Cancion cancion) {
		this.cancion = cancion;
	}

	
	
}
