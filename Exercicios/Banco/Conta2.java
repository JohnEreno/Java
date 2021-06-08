public class Conta2 {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public void saldo() {
		System.out.println("O saldo é: " + this.saldo);
	}
}
