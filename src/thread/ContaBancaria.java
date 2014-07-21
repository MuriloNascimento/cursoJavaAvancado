package thread;

public class ContaBancaria {
	
	private double saldo;
	
	public ContaBancaria(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void sacar(double valor){
		this.saldo = this.saldo - valor;
	}

}
