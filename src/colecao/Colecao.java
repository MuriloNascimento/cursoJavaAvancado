package colecao;

import java.util.*;

public class Colecao {

	public static void main(String[] args) {
		
		Collection<String> c = new ArrayList<>();
		c.add("A");
		c.add("E");
		c.add("I");
		
		System.out.println(c.toString());
		
		/* Grupos */
		
		Collection<String> c2 = Arrays.asList("O","U");
		c.addAll(c2);
		System.out.println(c.toString());
		System.out.println(c.containsAll(c2));
		
		/*  Percorrer todos os elementos   */
		
		for (String string : c) {
			System.out.println(string);
		}
		
		String[] s = c.toArray(new String[c.size()]);
		System.out.println(Arrays.toString(s));
		
		

	}

}
