package iesdonana.vidswingbe.leccion19;

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

		setJMenuBar(crearMenuBar());
		
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

	private JMenuBar crearMenuBar() {
		JMenuBar barraMenu = new JMenuBar();

		JMenu archivo = new JMenu("Archivo");
		JMenuItem exportar = new JMenuItem("Exportar datos...");
		JMenuItem importar = new JMenuItem("Importar datos...");
		JMenuItem salir = new JMenuItem("Salir");

		archivo.add(exportar);
		archivo.add(importar);
		archivo.addSeparator();
		archivo.add(salir);

		JMenu ventana = new JMenu("Ventana");
		JMenu mostrar = new JMenu("Mostrar");
		JMenuItem formularioPersona = new JMenuItem("Formulario persona");
		mostrar.add(formularioPersona);
		ventana.add(mostrar);

		barraMenu.add(archivo);
		barraMenu.add(ventana);

		return barraMenu;
	}
}
