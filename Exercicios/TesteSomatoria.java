public class TesteSomatoria {
	public static void main(String[] args) {
		int contador = 1;
		int total = 0;
		
		while(contador <= 10) {
			total += contador;
			
			System.out.println(contador);
			contador++;
		}
		System.out.println("A soma total dos números é: " + total);
	}
}
