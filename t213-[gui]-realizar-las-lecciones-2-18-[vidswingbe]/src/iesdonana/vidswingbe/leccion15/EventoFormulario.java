package iesdonana.vidswingbe.leccion15;

import java.util.EventObject;

public class EventoFormulario extends EventObject {
	
	private String nombre;
	private String ocupacion;
	private int categoriaEdad;

	public EventoFormulario(Object source) {
		super(source);
	}
	
	public EventoFormulario(Object source, String nombre, String ocupacion, int categoriaEdad) {
		super(source);
		
		this.nombre = nombre;
		this.ocupacion = ocupacion;
		this.categoriaEdad = categoriaEdad;
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
}
