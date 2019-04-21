package iesdonana.vidswingbe.leccion18;

import java.util.EventObject;

public class EventoFormulario extends EventObject {
	
	private String nombre;
	private String ocupacion;
	private int categoriaEdad;
	private String categoriaEmpleado;
	private String textoId;
	private boolean esCiudadano;
	private String genero;

	public EventoFormulario(Object source) {
		super(source);
	}
	
	public EventoFormulario(Object source, String nombre, String ocupacion,
							int categoriaEdad, String categoriaEmpleado,
							String taxId, boolean esCiudadano, String genero) {
		super(source);
		
		this.nombre = nombre;
		this.ocupacion = ocupacion;
		this.categoriaEdad = categoriaEdad;
		this.categoriaEmpleado = categoriaEmpleado;
		this.textoId = taxId;
		this.esCiudadano = esCiudadano;
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	public int getCategoriaEdad() {
		return categoriaEdad;
	}

	public String getCategoriaEmpleado() {
		return categoriaEmpleado;
	}

	public String getTextoId() {
		return textoId;
	}

	public boolean isEsCiudadano() {
		return esCiudadano;
	}

	public String getGenero() {
		return genero;
	}
}
