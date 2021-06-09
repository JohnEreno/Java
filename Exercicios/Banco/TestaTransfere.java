public class TestaTransfere {
	public static void main(String[] args) {
		
		Conta4 contaMarcela = new Conta4();
		Conta4 contaPaulo = new Conta4();
		
		contaMarcela.deposita(1500.00);
		
		System.out.print("Marcela: ");
		contaMarcela.saldo();
		
		System.out.print("Paulo: ");
		contaPaulo.saldo();
		
		
		if(contaMarcela.trasfere(350.00, contaPaulo)) {
			System.out.println("Transferindo: ");
			
			System.out.print("Marcela: ");
			contaMarcela.saldo();
			
			System.out.print("Paulo: ");
			contaPaulo.saldo();
			
		}
		else {
			System.out.println("Faltou dinheiro");
		}
		
	}
}
