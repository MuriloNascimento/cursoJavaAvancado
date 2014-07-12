package colecao;

import java.util.*;

public class ColecaoSet {

	public static void main(String[] args) {
		
		String[] cores = {"Preto","Vermelho","Amarelo","Preto"};
		
		List<String> listaCores = Arrays.asList(cores);
		
		System.out.println(listaCores);
		
		Set<String> setCores = new HashSet<>(listaCores);
		System.out.println(setCores);
		
	}

}
