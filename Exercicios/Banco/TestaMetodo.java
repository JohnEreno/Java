public class TestaMetodo {
	public static void main(String[] args) {
		
		Conta2 conta = new Conta2();
		
		Conta2 contaCorrente = new Conta2();
		
		conta.deposita(50.85);
		
		contaCorrente.deposita(155.43);
		
		System.out.print("(Conta 1) ");
		conta.saldo();
		
		System.out.print("(Conta 2) ");
		contaCorrente.saldo();
	}
}
