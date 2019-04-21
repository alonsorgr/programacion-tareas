package iesdonana.vidswingbe.leccion13;

import java.util.EventListener;

public interface ReceptorFormulario extends EventListener {
	void eventoOcurrido(EventoFormulario e);
}
