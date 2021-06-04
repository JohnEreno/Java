public class TestaVariaveis {
	public static void main(String[] args) {
		int idade;
		double altura;
		double peso;
		double imc;
		
		idade = 20;
		altura = 1.65;
		peso = 70.8;
		
		imc = (70.8)/(1.65*1.65);
		
		//Significado de concatenar. Ligar, unir de modo logico e homogeneo.
		
		//Concatena uma string, uma variavel e outra string.
		System.out.println("A idade é: " + idade + " anos.");
		System.out.println("A altura é: " + altura + " m.");
		System.out.println("O peso é: " + peso + " kg.");
		System.out.println("O IMC é: " + imc);
		
	}
}