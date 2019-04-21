package iesdonana.vidswingbe.leccion13;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


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
