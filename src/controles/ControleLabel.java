package controles;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class ControleLabel extends JFrame {
	
	public ControleLabel(){
		super("Label");
		
		JLabel s = new JLabel("label simples");
		s.setToolTipText("Meu tooltipe");
		
		Font fonte = new Font("serif", Font.BOLD, 28);
		JLabel lab = new JLabel("iaioupidatipo");
		lab.setFont(fonte);
		lab.setForeground(Color.BLUE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(s);
		c.add(lab);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		setVisible(true);
	}
	
}
