public class TestaCaracteres {
	public static void main(String[] args) {
		char letra = 'A';
		String texto = "ABC";
		char valor = 66;
		char valorsoma = 66;
		String palavra = "Curso de Java ";
		
		valorsoma = (char) (valorsoma + 1);
		
		palavra = palavra + 2021;

		System.out.println(palavra);
		
		System.out.println("(CHAR): " + letra);
		System.out.println("(CHAR/INT): " + valor);
		System.out.println("(CHAR/INT)+1: " + valorsoma);
		System.out.println("(STRING): " + texto);
			
	}
}
