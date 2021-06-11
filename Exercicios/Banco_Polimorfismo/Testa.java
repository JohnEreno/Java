public class Testa {

	public static void main(String[] args) {
		
		ControleBonificacao controle = new ControleBonificacao();
		
		Gerente gerente = new Gerente();
		Funcionario funcionario = new Funcionario();
		SetorTI ti = new SetorTI();
		
		gerente.setNome("João");
		gerente.setCpf("111.111.111-11");
		gerente.setSalario(6500.00);
		
		funcionario.setNome("José");
		funcionario.setCpf("222.222.222-22");
		funcionario.setSalario(4000.00);
		
		ti.setNome("Pedro");
		ti.setCpf("333.333.333-33");
		ti.setSalario(4500.00);
		
		controle.registra(gerente);
		controle.registra(funcionario);
		controle.registra(ti);
		
		System.out.println("Gerente Bônus: " + gerente.getBonificacao());
		System.out.println("Funcionario Bônus: " + funcionario.getBonificacao());
		System.out.println("TI Bônus: " + ti.getBonificacao());
		
		System.out.println("Total Bônus: " + controle.getTotal());
	}
}
