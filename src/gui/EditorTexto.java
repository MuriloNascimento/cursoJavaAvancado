package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.*;

public class EditorTexto extends JFrame implements ActionListener {
	
	JTextArea texto;
	
	public EditorTexto(){
		super("Editor de textos");
		
		texto = new JTextArea();
		JScrollPane scroll = new JScrollPane(texto);
		texto.setFont(new Font("Serif", Font.PLAIN, 26));
		
		
		
		JButton botao = new JButton("Abrir Arquivo");
		botao.setFont(new Font("Serif", Font.PLAIN, 26));
		botao.addActionListener(this);
		
		Container c = getContentPane();
		c.add(BorderLayout.CENTER, scroll);
		c.add(BorderLayout.SOUTH, botao);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new EditorTexto();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JFileChooser c = new JFileChooser();
		c.showOpenDialog(this);
		File file = c.getSelectedFile();
		
		try{
			Path path = Paths.get(file.getAbsolutePath());
			String retorno = new String(Files.readAllBytes(path));
			texto.setText(retorno);
		} catch(Exception erro) {
			JOptionPane.showMessageDialog(this, "O arquivo não pode ser carregado");
		}
		
	}

}
