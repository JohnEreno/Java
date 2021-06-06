public class TestaCodicional2 {
	public static void main(String[] args) {
		System.out.println("Testando codicionais");
		
		//Mude a idade.
		int idade = 20;
		//Mude a condição.
		boolean acompanhado = true;
		
		if(idade >= 18) {
			System.out.println("Seja bem vindo !");
		} else {
			if(acompanhado) {
				System.out.println("Seja bem vindo !");
			} else {
				System.out.println("Infelizmente você não pode entrar.");
			}
			
		}
		
	}
}
