package sistema;

import java.io.Console;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Operacional {

	public static void main(String[] args) {
		
		Properties p = System.getProperties();
		System.out.println(p.getProperty("java.version"));

		/*Set<Object> pk = p.keySet();
		
		for (Object key : pk) {
			System.out.println(p.get(key));
		}*/
		
		/*Console c = System.console();
		System.out.println("Informe seu usario");
		String user = c.readLine();
		System.out.println("Informe sua senha");
		char[] pass = c.readPassword();
		
		System.out.println("Usuario= " + user + " Senha= " + new String(pass));
		*/
		
		try {
			Runtime.getRuntime().exec("Notepad");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
