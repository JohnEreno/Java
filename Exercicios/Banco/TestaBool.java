public class TestaBool {
	public static void main(String[] args) {
		
		Conta3 conta = new Conta3();
		
		conta.deposita(555.78);
		
		conta.saldo();
		
		boolean conseguiuRetirar = conta.saca(55.78);
		
		if(conseguiuRetirar) {
			System.out.println(conseguiuRetirar);
			conta.saldo();
		}
		else {
			System.out.println(conseguiuRetirar);

		}
	}
}
