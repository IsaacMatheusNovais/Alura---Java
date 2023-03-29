
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaIsaac = new Conta();
		//Uso de metódo para atribuir valor à conta.
		contaIsaac.deposita(50);
		System.out.println(contaIsaac.saldo);
		
		boolean conseguiuRetirar = contaIsaac.saca(30);
		System.out.println(contaIsaac.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaMarcela = new Conta();
		contaMarcela.deposita(1000);
		
		//If dentro da invocação do método para dar retorno ao user
		if (contaMarcela.transfere(300, contaIsaac)) {
			System.out.println("Transferencia Realizada");
		} else { System.out.println("Faltou Bufunfa");}
		
		System.out.println(contaIsaac.saldo);
		System.out.println(contaMarcela.saldo);
	}

}
