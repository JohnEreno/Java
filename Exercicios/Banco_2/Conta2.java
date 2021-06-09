public class Conta2 {

	private double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	public void deposita(double valor) {
		this.saldo =+ valor;
	}
	
	public boolean saca(double valor) {
		if(valor <= this.saldo) {
			saldo -= valor;
			return true;
		}
		else {
			return false;
		}
	}
	
	public double pegaSaldo() {
		return this.saldo;
	}
}
