package iesdonana.vidswingbe.leccion18;

import javax.swing.*;
import java.awt.*;


public class PanelTexto extends JPanel {
	
	private JTextArea areaTexto;
	
	public PanelTexto() {
		areaTexto = new JTextArea();
		
		setLayout(new BorderLayout());
		
		add(new JScrollPane(areaTexto), BorderLayout.CENTER);
	}
	
	public void appendText(String text) {
		areaTexto.append(text);
	}
}
