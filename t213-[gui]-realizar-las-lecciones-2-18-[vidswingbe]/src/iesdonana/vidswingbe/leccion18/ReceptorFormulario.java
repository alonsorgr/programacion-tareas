package iesdonana.vidswingbe.leccion18;

import java.util.EventListener;

public interface ReceptorFormulario extends EventListener {
	void eventoOcurrido(EventoFormulario e);
}
