package refinado;

import java.util.*;

public class Garbage {
	
	public static long carregarMemoria() {
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < 100_000; i++) {
			list.add(i);
		}
		
		return Runtime.getRuntime().freeMemory();
	}

	public static void main(String[] args) {
		
		Runtime rt = Runtime.getRuntime();
		
		int MB = 1_048_576;
		double total = rt.maxMemory() / MB;
		
		double inicio = total - (carregarMemoria()/MB);
		
		System.out.println(total + " mb");
		System.out.println(inicio + " mb");
		
		rt.runFinalization();
		rt.gc();
		
		double fim = total - (carregarMemoria()/MB);
		System.out.println(fim + " mb");
		

	}

}
