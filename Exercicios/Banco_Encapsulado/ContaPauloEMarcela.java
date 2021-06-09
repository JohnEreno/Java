public class ContaPaulo {

	public static void main(String[] args) {
		
		double valor = 345.55;
		
		Conta contaPaulo = new Conta();
		Conta contaMarcela = new Conta();
		
		contaPaulo.setCliente("Paulo", "222.222.222-22", "Estudante");
		contaPaulo.setAgencia(0001);
		contaPaulo.setNumero(12345);
		
		contaMarcela.setCliente("Marcela", "999.999.999-99", "Empresária");
		contaMarcela.setAgencia(0002);
		contaMarcela.setNumero(98745);
		
		contaPaulo.deposita(1002.55);
		
		contaPaulo.getTudo();
		System.out.println();
		
		System.out.println("Transferindo para Marcela (" + valor +")");
		System.out.println();
		
		contaPaulo.transfere(valor,contaMarcela);
		
		contaPaulo.getTudo();
		System.out.println();
	
		contaMarcela.getTudo();
		
	}
}
