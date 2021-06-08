public class TesteReferencias {
	public static void main(String[] args) {
		Conta segundaConta = new Conta();
		
		segundaConta.saldo = 300.0;
		
		Conta referencia = segundaConta;
		
		System.out.println(referencia.saldo);
	}
}
