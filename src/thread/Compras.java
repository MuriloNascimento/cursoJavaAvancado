package thread;

public class Compras implements Runnable{
	
	ContaConjunta conta = new ContaConjunta();
	
	public static void main(String[] args) {
		
		Compras c = new Compras();
		
		new Thread(c,"Pai").start();
		new Thread(c,"Mae").start();
		new Thread(c,"Filho").start();
		new Thread(c,"Filha").start();
		
	}
	
	@Override
	public void run() {
		
		String cliente = Thread.currentThread().getName();
		
		for (int i = 0; i < 5; i++) {

			conta.sacar(20, cliente);
			if(conta.getSaldo() < 0){
				System.out.println("Conta estorou");
			}
			
		}
	}

}
