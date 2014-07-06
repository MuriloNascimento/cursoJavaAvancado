package gui;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;


public class ControleCheck extends JFrame{
	
	JTextField texto;
	JCheckBox bold;
	JCheckBox italic;
	
	public ControleCheck(){
		super();
		
		Container c = getContentPane();
		texto = new JTextField("Veja a fonte mudar");
		texto.setFont(new Font("Serif", Font.PLAIN, 26));
		
		bold = new JCheckBox("bold");
		bold.addItemListener(new CheckListener());
		italic = new JCheckBox("italic");
		italic.addItemListener(new CheckListener());
		
		c.setLayout(new FlowLayout());
		c.add(texto);
		c.add(bold);
		c.add(italic);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
	}
	
	class CheckListener implements ItemListener {
		
		public void itemStateChanged(ItemEvent e){
			if(bold.isSelected() && italic.isSelected()) {
				texto.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 26));
			} else if(bold.isSelected()) {
				texto.setFont(new Font("Serif", Font.BOLD, 26));
			} else if(italic.isSelected()) {
				texto.setFont(new Font("Serif", Font.ITALIC, 26));
			} else {
				texto.setFont(new Font("Serif", Font.PLAIN, 26));
			}
		}
		
	}

	public static void main(String[] args) {
		
		new ControleCheck();

	}

}
