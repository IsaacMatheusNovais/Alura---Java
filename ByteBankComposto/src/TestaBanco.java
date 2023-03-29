
public class TestaBanco {
	public static void main(String[] args) {
		
		Cliente Isaac = new Cliente();
		Isaac.nome = "Isaac Matheus";
		Isaac.cpf = "493.583.158-81";
		Isaac.profissao = "Programador";
		
		Conta contaIsaac = new Conta();
		contaIsaac.titular = Isaac;
		
		System.out.println(contaIsaac.titular.nome);
	}
}
