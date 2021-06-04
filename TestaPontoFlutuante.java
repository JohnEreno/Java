public class TestaPontoFlutuante {
	public static void main(String[] args) {
		double salario;
		int valor = 15;
		double valorcerto = 15;
		
		salario = 1250.70;
		valor = valor/2;
		valorcerto = valorcerto/2;
		
		System.out.println("Meu salário é: " + salario);
		
		//O valor é pois é uma variavel do tipo int.
		System.out.println("O valor deveria ser 7.5, porem... é: " + valor);
		
		//O valor está correto, pois foi usada uma variavel do tipo double.
		System.out.println("O valor esta correto agora: " + valorcerto);
		
	}
}