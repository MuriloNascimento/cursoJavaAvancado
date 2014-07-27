package controles;

import java.util.ArrayList;

public class Generico <E> {
	
	E elemento;
	
	public void setElemento(E elemento){
		this.elemento = elemento;
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes")
		Generico<String> g = new Generico();
		g.setElemento("Alo mundo");
		
		System.out.println(g);
		
		@SuppressWarnings("unused")
		ArrayList<? extends Number> qualquer = new ArrayList<>();

	}

}
