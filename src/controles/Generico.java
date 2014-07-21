package controles;

import java.util.ArrayList;

public class Generico <E> {
	
	E elemento;
	
	public void setElemento(E elemento){
		this.elemento = elemento;
	}

	public static void main(String[] args) {
		
		Generico<String> g = new Generico();
		g.setElemento("Alo mundo");
		
		System.out.println(g);
		
		ArrayList<? extends Number> qualquer = new ArrayList<>();

	}

}
