
public class TesteReferencia {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("saldo na primeira conta "+ primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println("saldo na segunda conta "+ segundaConta.saldo);
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
	}

}
