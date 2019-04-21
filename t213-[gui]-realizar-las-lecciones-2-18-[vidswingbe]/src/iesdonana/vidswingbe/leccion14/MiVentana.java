package iesdonana.vidswingbe.leccion14;

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
			public void textoEmitido(String text) {
				panelTexto.appendText(text);
			}
		});
		
		panelFormulario.setReceptorFormulario(new ReceptorFormulario() {
			public void eventoOcurrido(EventoFormulario e) {
				String name = e.getNombre();
				String occupation = e.getOcupacion();
				
				panelTexto.appendText(name + ": " + occupation + "\n");
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
