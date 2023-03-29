//Instanciamento da classe, estabelecimento de herança e implementação de método.
public class Gerente extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		AutenticacaoUtil autenticador = new AutenticacaoUtil();
	}
	
	public double getBonificacao() {
		System.out.println("Bonificacao gerente");
		return super.getSalario();
	}
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}
