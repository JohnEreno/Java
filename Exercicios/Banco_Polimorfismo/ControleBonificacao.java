public class ControleBonificacao extends Funcionario {

	private double soma;
	
	public void registra(Funcionario f) {
		soma += f.getBonificacao();
	}
	
	public double getTotal() {
		return this.soma;
	}
	
}
