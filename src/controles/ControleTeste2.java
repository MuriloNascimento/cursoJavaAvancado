package controles;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ControleTeste2 extends JFrame implements ActionListener {
	
	JTextField login;
	JPasswordField senha;
	JButton ok, cancel;
	
	public ControleTeste2(){
		super("textos e senhas");
		
		login = new JTextField();
		senha = new JPasswordField();
		
		ok = new JButton("Ok");
		ok.addActionListener(this);
		
		cancel = new JButton("Cancel");
		cancel.addActionListener(this);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(3,2));
		c.add(new JLabel("Login:"));
		c.add(login);
		c.add(new JLabel("Senha:"));
		c.add(senha);
		c.add(ok);
		c.add(cancel);
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new ControleTeste2();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == ok){
			
			String s = "login: " + login.getText()
					 + "\nsenha: " + new String(senha.getPassword());
			JOptionPane.showMessageDialog(null, s);
			
		} else if (e.getSource() == cancel){
			
			login.setText("");
			senha.setText("");
			
		}
	}

}
