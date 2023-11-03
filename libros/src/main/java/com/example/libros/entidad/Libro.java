package com.example.libros.entidad;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;



public class Libro {

		private Long id;
		@NotBlank(message = "{autor.notblank}")
		@Size(min = 1, max = 100, message = "{autor.size}")
		private String autor;
		private String nombre;
		private Double precio;
		
		private Categoria categoria;
			
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getAutor() {
			return autor;
		}
		public void setAutor(String autor) {
			this.autor = autor;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public Categoria getCategoria() {
			return categoria;
		}
		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}
		public Double getPrecio() {
			return precio;
		}
		public void setPrecio(Double precio) {
			this.precio = precio;
		}
		
		
		

	}
