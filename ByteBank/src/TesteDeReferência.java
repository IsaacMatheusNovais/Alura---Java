
public class TesteDeReferência {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
	
		Conta segundaConta = primeiraConta;
		segundaConta = primeiraConta;
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
