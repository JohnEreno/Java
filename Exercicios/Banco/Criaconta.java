public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraconta = new Conta();
		primeiraconta.saldo = 200.0;
		primeiraconta.agencia = 0001;
		primeiraconta.numero = 1234;
		primeiraconta.titular = "João Vitor";
		
		
		System.out.println("Titular: " + primeiraconta.titular);
		System.out.println("Agencia: " + primeiraconta.agencia);
		System.out.println("Numero: " + primeiraconta.numero);
		System.out.println("Saldo: " + primeiraconta.saldo);
	}
}
