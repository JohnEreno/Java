public class TesteGerente {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		
		gerente.setNome("João");
		gerente.setCpf("333.333.333-33");
		gerente.setSalario(4500.00);
		gerente.setSenha(1234);
		
		System.out.println("Nome: " + gerente.getNome());
		System.out.println("CPF: " + gerente.getCpf());
		System.out.println("Salário: " + gerente.getSalario());
		System.out.println("Bonificação: " + gerente.getBoneficacao());
		System.out.println("Senha Correta (4321): " + gerente.autentica(4321));
		
	}
}
