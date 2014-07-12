package colecao;

import java.util.*;

public class ColecaoMap {

	public static void main(String[] args) {
		
		Map<String, String> pais = new HashMap<>();
		pais.put("BR", "Brasil");
		pais.put("RU", "Rússia");
		pais.put("IN", "Índia");
		pais.put("CH", "China");
		System.out.println(pais);
		
		System.out.println(pais.containsKey("BR"));
		System.out.println(pais.containsValue("Alemanha"));
		System.out.println(pais.get("CH"));
		
		Set<String> chaves = pais.keySet();
		for (String chavePais : chaves) {
			System.out.println(pais.get(chavePais));
		}

	}

}
