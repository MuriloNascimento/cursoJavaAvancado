package thread;

import java.util.Scanner;

public class SimulacaoExe {

	public static void main(String[] args) {
		
		ContaBancaria c1 = new ContaBancaria(3000);
		
		Runnable descontoJuros = new SimulacaoJuros(c1);
		new Thread(descontoJuros).start();
		int i = 0;
		do {
			System.out.println("Ver saldo ?");
			@SuppressWarnings("resource")
			Scanner s = new Scanner(System.in);
			i = s.nextInt();
			if(i == 0){
				System.out.println(c1.getSaldo());
			}
		} while(i == 0);

	}

}
