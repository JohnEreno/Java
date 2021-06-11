public class SetorTI extends Funcionario{

	public double getBonificacao() {
		return (super.getBonificacao() + super.getSalario()*0.15);
	}
	
}
