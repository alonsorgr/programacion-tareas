package iesdonana.vidswingbe.leccion14;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;


public class PanelFormulario extends JPanel {
	
	private JLabel nombre;
	private JLabel ocupacion;
	private JTextField textoNombre;
	private JTextField textoOcupacion;
	private JButton botonOk;
	private ReceptorFormulario receptorFormulario;
	private JList listaEdad;
	
	public PanelFormulario() {
		Dimension dim = getPreferredSize();
		dim.width = 250;
		setPreferredSize(dim);
		
		nombre = new JLabel("Nombre: ");
		ocupacion = new JLabel("Ocupacion: ");
		textoNombre = new JTextField(10);
		textoOcupacion = new JTextField(10);
		listaEdad = new JList();
		
		DefaultListModel ageModel = new DefaultListModel();
		ageModel.addElement("Mayores de 18");
		ageModel.addElement("18 a 65");
		ageModel.addElement("65 o superior");
		listaEdad.setModel(ageModel);
		
		listaEdad.setPreferredSize(new Dimension(110, 70));
		listaEdad.setBorder(BorderFactory.createEtchedBorder());
		listaEdad.setSelectedIndex(1);
		
		botonOk = new JButton("OK");
		
		botonOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textoNombre.getText();
				String occupation = textoOcupacion.getText();
				String ageCat = (String) listaEdad.getSelectedValue();
				
				System.out.println(ageCat);
				
				EventoFormulario ev = new EventoFormulario(this, name, occupation);
				
				if(receptorFormulario != null) {
					receptorFormulario.eventoOcurrido(ev);
				}
			}
		});
		
		Border innerBorder = BorderFactory.createTitledBorder("Agregar persona");
		Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
		
		setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		

		// 1
		
		gc.weightx = 1;
		gc.weighty = 0.1;
		
		gc.gridx = 0;
		gc.gridy = 0;
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(0, 0, 0, 5);
		add(nombre, gc);
		
		gc.gridx = 1;
		gc.gridy = 0;
		gc.insets = new Insets(0, 0, 0, 0);
		gc.anchor = GridBagConstraints.LINE_START;
		add(textoNombre, gc);

		// 2
		
		gc.weightx = 1;
		gc.weighty = 0.1;
		
		gc.gridy = 1;
		gc.gridx = 0;
		gc.insets = new Insets(0, 0, 0, 5);
		gc.anchor = GridBagConstraints.LINE_END;
		add(ocupacion, gc);
		
		gc.gridy = 1;
		gc.gridx = 1;
		gc.insets = new Insets(0, 0, 0, 0);
		gc.anchor = GridBagConstraints.LINE_START;
		add(textoOcupacion, gc);

		// 3
		
		gc.weightx = 1;
		gc.weighty = 0.2;
		
		gc.gridy = 2;
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.insets = new Insets(0, 0, 0, 0);
		add(listaEdad, gc);

		// 4
		
		gc.weightx = 1;
		gc.weighty = 2.0;
		
		gc.gridy = 3;
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.insets = new Insets(0, 0, 0, 0);
		add(botonOk, gc);
	}
	
	public void setReceptorFormulario(ReceptorFormulario listener) {
		this.receptorFormulario = listener;
	}
}
