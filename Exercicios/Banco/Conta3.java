public class Conta3 {
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
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		else {
			return false;
		}
	}
}
