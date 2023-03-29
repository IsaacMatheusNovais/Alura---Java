
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaTaynara = new Conta();
		contaTaynara.getSaldo();
		
		contaTaynara.titular = new Cliente();
		System.out.println(contaTaynara.titular);
		
	}
}
