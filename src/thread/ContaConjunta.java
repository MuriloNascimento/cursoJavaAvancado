package thread;

public class ContaConjunta {
	private int saldo = 100;
	
	public int getSaldo() {
		return saldo;
	}
	
	public synchronized void sacar(int valor, String cliente){
		if(saldo >= valor){
			System.out.println(cliente + "vai sacar");
			try {
				System.out.println("Aguarde");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				saldo -= valor;
				System.out.println(cliente + " sacou" + valor);
			}
		} else {
			System.out.println(cliente + " sue saldo é insuficiente");
		}
	}
}
