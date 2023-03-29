//Instanciamento da classe.
public abstract class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	
	//getters, setters e funções. 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//metodo abstrato, sem corpo. ao ser chamado o que valerá será o metodo
	//das classes "filhas".
	public abstract double getBonificacao ();
	
}

