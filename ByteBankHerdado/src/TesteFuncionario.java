
public class TesteFuncionario {
	public static void main(String[] args) {
		
		Funcionario Isaac = new Gerente();
		Isaac.setNome("Isaac Matheus");
		Isaac.setCpf("123456789-85");
		Isaac.setSalario(3500);
		System.out.println(Isaac.getNome());
		System.out.println(Isaac.getCpf());
		System.out.println(Isaac.getSalario());
		System.out.println(Isaac.getBonificacao());
		
		Cliente cliente = new Cliente();
	}
}
