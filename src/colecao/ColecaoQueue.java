package colecao;

import java.util.*;

public class ColecaoQueue {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		fila.add("Maria");
		fila.add("Joao");
		fila.add("Fabio");
		System.out.println(fila);
		System.out.println(fila.peek());
		fila.poll();
		System.out.println(fila.peek());
		System.out.println(fila);
		
		/* Metodos linked list */
		
		LinkedList<String> l = (LinkedList<String>) fila;
		l.addFirst("Dona Marta");
		
		System.out.println(fila);
		System.out.println(fila.peek());

	}

}
