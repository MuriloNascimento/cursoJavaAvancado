package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Janela extends JFrame implements ActionListener{
	
	JButton botao = new JButton("Clique Aqui");
	
	public Janela() {
		
		super("Eventos");
		
		botao.addActionListener(this);
		getContentPane().add(botao);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		botao.setText("foi clicado");
		
	}
}
