public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	public boolean deposita (double valor) {
		if(valor >= 0) {
			this.saldo += valor;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean saca(double valor) {
		if(valor <= this.saldo) {
			this.saldo -= valor;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta conta) {
		if(valor <= getSaldo()) {
			this.saldo -= valor;
			conta.deposita(valor);
			return true;
		}
		else {
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void getCliente() {
		System.out.println("Nome: " + this.titular.nome);
		System.out.println("CPF: " + this.titular.cpf);
		System.out.println("Profissão: " + this.titular.profissao);
	}
	
	public void getTudo() {
		getCliente();
		System.out.println("Agencia: " + getAgencia());
		System.out.println("Número: " + getNumero());
		System.out.println("Saldo: " + getSaldo());
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setAgencia(int numero) {
		this.agencia = numero;
	}
	
	public void setCliente(String nome, String cpf, String profissao) {
		titular = new  Cliente();
		this.titular.nome = nome;
		this.titular.cpf = cpf;
		this.titular.profissao = profissao;
	}
	
}
