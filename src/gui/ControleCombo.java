package gui;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class ControleCombo extends JFrame implements ItemListener{
	
	JComboBox<String> combo;
	JLabel label;
	ImageIcon[] imagens = {
			new ImageIcon(getClass().getResource("../images/2014-01-17 09.54.08.jpg")),
			new ImageIcon(getClass().getResource("../images/2014-01-18 10.01.08.jpg")),
			new ImageIcon(getClass().getResource("../images/nature-full-hd-wallpaper-national-geographic-7822261-1920-1080.jpg")),
	};
	
	public ControleCombo() {
		super("Album de fotos");
		
		Container c = getContentPane();
		
		combo = new JComboBox<String>();
		combo.setFont(new Font("Serif",Font.PLAIN, 26));
		combo.addItem("Foto 1");
		combo.addItem("Foto 2");
		combo.addItem("Foto 3");
		combo.addItemListener(this);
		
		label = new JLabel(imagens[0]);
		
		c.add(BorderLayout.NORTH, combo);
		c.add(BorderLayout.CENTER, label);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ControleCombo();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
		if(e.getStateChange() == ItemEvent.SELECTED) {
			label.setIcon(imagens[combo.getSelectedIndex()]);
		}
		
	}

}
