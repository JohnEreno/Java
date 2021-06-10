public class TestaCodicional {
	public static void main(String[] args) {
		System.out.println("Testando codicionais");
		
		//Mude a idade.
		int idade = 20;
		
		if(idade >= 18) {
			System.out.println("Você tem " + idade + " anos, portanto é maior de idade.");
		} else {
			System.out.println("Você tem " + idade + " anos, portanto é menor de idade.");
		}
	}
}
