public class ContaPauloEMarcelaConstrutor{

	public static void main(String[] args) {
		
		double valor = 345.55;
		
		ContaConstrutor contaPaulo = new ContaConstrutor(0001, 12345, 1002.55);
		ContaConstrutor contaMarcela = new ContaConstrutor(0002, 98765, 0);
		
		contaPaulo.setCliente("Paulo", "222.222.222-22", "Estudante");
		
		contaMarcela.setCliente("Marcela", "999.999.999-99", "Empresária");

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
