package iesdonana.vidswingbe.leccion13;

import java.awt.BorderLayout;

import javax.swing.JFrame;


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
			public void textoEmitido(String texto) {
				panelTexto.appendText(texto);
			}
		});
		
		panelFormulario.setReceptorFormulario(new ReceptorFormulario() {
			public void eventoOcurrido(EventoFormulario e) {
				String nombre = e.getNombre();
				String ocupacion = e.getOcupacion();
				
				panelTexto.appendText(nombre + ": " + ocupacion + "\n");
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
