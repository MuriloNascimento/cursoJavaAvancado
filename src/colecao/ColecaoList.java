package colecao;

import java.util.*;

public class ColecaoList {

	public static void main(String[] args) {
		
		List<String> bandas = new ArrayList<>();
		bandas.add("Five Fingers");
		bandas.add("Disturbed");
		bandas.add("Papa Roach");
		bandas.add("3 days grace");
		bandas.add("Megadeath");
		bandas.add("Opet");
		
		System.out.println(bandas);
		
		/*for (int i = 0; i < bandas.size(); i++) {
			String banda = bandas.get(i);
			bandas.set(i, banda.toUpperCase());
		}
		
		System.out.println(bandas);
		System.out.println(bandas.indexOf("Opet"));
		System.out.println(bandas.subList(2, 4));
		
		*/
		
		Collections.sort(bandas);
		System.out.println(bandas);
		
		Collections.reverse(bandas);
		System.out.println(bandas);
		
		Collections.shuffle(bandas);
		System.out.println(bandas);
		
		Collections.addAll(bandas, "Metallica","Chevelle");
		System.out.println(bandas);
		
		
		System.out.println(Collections.frequency(bandas, "Chevelle"));
		
		Collections.sort(bandas);
		System.out.println(bandas);
		int resultado = Collections.binarySearch(bandas, "Chevelle");
		System.out.println(resultado);
		
		
		

	}

}
