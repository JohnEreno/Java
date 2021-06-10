public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Nico", "222.222.222-22", 2600.00);
		
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("CPF: " + funcionario.getCpf());
		System.out.println("Salário: " + funcionario.getSalario());
		System.out.println("Bonificação: " + funcionario.getBoneficacao());
	}

}
