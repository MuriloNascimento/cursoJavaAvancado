package thread;

public class SimulacaoJuros implements Runnable {
	
	ContaBancaria conta;
	
	public SimulacaoJuros(ContaBancaria conta){
		this.conta = conta;
	}
	
	@Override
	public void run() {
		
		try {
			while(true) {
				conta.sacar(30);;
				Thread.sleep(1000);
			} 
		} catch (InterruptedException e) {
			return;
		}
		
	}
}
