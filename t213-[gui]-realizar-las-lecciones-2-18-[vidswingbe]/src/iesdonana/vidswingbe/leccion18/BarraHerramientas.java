package iesdonana.vidswingbe.leccion18;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BarraHerramientas extends JPanel implements ActionListener {
	private JButton botonHola;
	private JButton botonAdios;
	
	private ReceptorCadena receptorCadena;
	
	public BarraHerramientas() {
		setBorder(BorderFactory.createEtchedBorder());
		
		botonHola = new JButton("Hola");
		botonAdios = new JButton("Adios");
		
		botonHola.addActionListener(this);
		botonAdios.addActionListener(this);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(botonHola);
		add(botonAdios);
	}
	
	public void setStringListener(ReceptorCadena listener) {
		this.receptorCadena = listener;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton boton = (JButton)e.getSource();
		
		if(boton == botonHola) {
			if(receptorCadena != null) {
				receptorCadena.textoEmitido("Hello\n");
			}
		}
		else if(boton == botonAdios) {
			if(receptorCadena != null) {
				receptorCadena.textoEmitido("Goodbye\n");
			}
		}
		
	}
}
