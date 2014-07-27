package redes;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ConselhoCliente {

	public static void main(String[] args) throws IOException, Exception {
		
		@SuppressWarnings("resource")
		Socket socket = new Socket("127.0.0.1", 5000);
		Scanner s = new Scanner(socket.getInputStream());
		System.out.println("Mensagem:" + s.nextLine());
		s.close();

	}

}
