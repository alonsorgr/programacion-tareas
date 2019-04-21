package iesdonana.vidswingbe.leccion14;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;


public class BarraHerramientas extends JPanel implements ActionListener {
	private JButton botonHola;
	private JButton botonAdios;
	
	private ReceptorCadena receptorCadena;
	
	public BarraHerramientas() {
		setBorder(BorderFactory.createEtchedBorder());
		
		botonHola = new JButton("Hello");
		botonAdios = new JButton("Goodbye");
		
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
