package iesdonana.vidswingbe.leccion16;

import java.util.EventListener;

public interface ReceptorFormulario extends EventListener {
	void eventoOcurrido(EventoFormulario e);
}
