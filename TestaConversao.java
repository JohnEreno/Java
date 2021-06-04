public class TestaConversao {
	public static void main(String[] args) {
		double salario = 1270.50;
		
		//Forcando um double a virar int.
		int valor = (int) salario;
		
		System.out.println("Salario(double): " + salario);
		System.out.println("Salario(int): " + valor);
	}
}