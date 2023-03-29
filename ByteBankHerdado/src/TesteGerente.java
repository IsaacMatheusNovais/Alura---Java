
public class TesteGerente {
	public static void main(String[] args) {
		Gerente Kako = new Gerente();
		Kako.setNome("Kako o Sapo");
		Kako.setCpf("123456789-54");
		Kako.setSalario(5000);
		System.out.println("Nome: " + Kako.getNome());
		System.out.println("O CPF de Kako é: " + Kako.getCpf());
		System.out.println("Salário: " + Kako.getSalario());
		
		Kako.setSenha(1234);
		boolean autenticou = Kako.autentica(1234);
		System.out.println(autenticou);
		
		System.out.println(Kako.getBonificacao());
		

	}
}
