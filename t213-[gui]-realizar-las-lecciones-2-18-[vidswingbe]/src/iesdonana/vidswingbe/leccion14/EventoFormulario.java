package iesdonana.vidswingbe.leccion14;

import java.util.EventObject;

public class EventoFormulario extends EventObject {
	
	private String nombre;
	private String ocupacion;

	public EventoFormulario(Object source) {
		super(source);
	}
	
	public EventoFormulario(Object source, String nombre, String ocupacion) {
		super(source);
		
		this.nombre = nombre;
		this.ocupacion = ocupacion;
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
	
	

}
