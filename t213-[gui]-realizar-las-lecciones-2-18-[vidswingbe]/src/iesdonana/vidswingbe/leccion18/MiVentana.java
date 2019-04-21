package iesdonana.vidswingbe.leccion18;

import javax.swing.*;
import java.awt.*;


public class MiVentana extends JFrame {
	
	private PanelTexto panelTexto;
	private BarraHerramientas barraHerramientas;
	private PanelFormulario panelFormulario;
	
	public MiVentana(String title) {
		super(title);
		
		setLayout(new BorderLayout());
		
		barraHerramientas = new BarraHerramientas();
		panelTexto = new PanelTexto();
		panelFormulario = new PanelFormulario();
		
		barraHerramientas.setStringListener(new ReceptorCadena() {
			public void textoEmitido(String text) {
				panelTexto.appendText(text);
			}
		});
		
		panelFormulario.setReceptorFormulario(new ReceptorFormulario() {
			public void eventoOcurrido(EventoFormulario e) {
				String nombre = e.getNombre();
				String ocupacion = e.getOcupacion();
				int categoriaEdad = e.getCategoriaEdad();
				String categoriaEmpleado = e.getCategoriaEmpleado();
				String genero = e.getGenero();
				
				panelTexto.appendText(
						nombre + ": " + ocupacion + " id:"
								+ categoriaEdad + " categoria: " + categoriaEmpleado +
								" genero: " + genero + "\n");
			}
		});
		
		add(panelFormulario, BorderLayout.WEST);
		add(barraHerramientas, BorderLayout.NORTH);
		add(panelTexto, BorderLayout.CENTER);
		
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
