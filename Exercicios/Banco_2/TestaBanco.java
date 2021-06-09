public class TestaBanco {

	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "222.222.222-22";
		paulo.profissao = "programador";
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.titular = paulo;
		contaDoPaulo.deposita(100.00);
		contaDoPaulo.agencia = 0001;
		contaDoPaulo.numero = 12345;
		
		System.out.println(contaDoPaulo.titular.nome);
		System.out.println("Agencia: " + contaDoPaulo.agencia);
		System.out.println("Conta: " + contaDoPaulo.numero);
		System.out.println("Saldo: " + contaDoPaulo.saldo);
	}
}
