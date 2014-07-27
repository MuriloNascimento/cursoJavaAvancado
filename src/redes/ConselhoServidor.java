package redes;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ConselhoServidor {

	public static void main(String[] args) throws IOException {
		
		@SuppressWarnings("resource")
		ServerSocket server = new ServerSocket(5000);
		
		while(true){
			Socket socket = server.accept();
			PrintWriter w = new PrintWriter(socket.getOutputStream());
			w.println("Aprenda Java e seja Contratado");
			w.close();
		}

	}

}
