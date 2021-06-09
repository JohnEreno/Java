public class Conta4 {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	public void saldo() {
		System.out.println("O saldo é: " + this.saldo);
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean trasfere(double valor, Conta4 destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		else {
			return false;
		}
	}
}
