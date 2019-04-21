package iesdonana.vidswingbe.leccion19;

import java.util.EventListener;

public interface ReceptorFormulario extends EventListener {
	void eventoOcurrido(EventoFormulario e);
}
