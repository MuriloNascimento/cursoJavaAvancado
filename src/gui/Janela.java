package gui;

import javax.swing.*;

public class Janela extends JFrame{

	public Janela() {
		
		super("Minha Janela");
		JButton botao = new JButton("clique");
		getContentPane().add(botao);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
	}
}
