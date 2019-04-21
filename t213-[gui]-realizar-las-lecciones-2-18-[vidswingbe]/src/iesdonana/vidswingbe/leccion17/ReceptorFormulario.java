package iesdonana.vidswingbe.leccion17;

import java.util.EventListener;

public interface ReceptorFormulario extends EventListener {
	void eventoOcurrido(EventoFormulario e);
}
