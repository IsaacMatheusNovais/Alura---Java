
public class TestaGetESet {
	public static void main(String[] args) {
		
		Cliente isaacMatheus = new Cliente();
		isaacMatheus.setNome("Isaac Matheus");
		
		//criação da conta n° 1.
		Conta conta1 = new Conta(346, 001, isaacMatheus);
		System.out.println(conta1.getAgencia());
		System.out.println(conta1.getTitular().getNome());
		
		//Criação da conta n° 2.
		Cliente cliente = new Cliente();
		Conta conta = new Conta(0346, 19854, cliente);
		conta.deposita(300);
		System.out.println(conta.getSaldo());
		conta.saca(75.50);
		System.out.println(conta.getSaldo());
		
		System.out.println(Conta.getTotal());
		;
	}	
}
