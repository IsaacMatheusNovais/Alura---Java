package sintaxes_variaveis_e_fluxo;

public class TestaValores {
	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		primeiro = 10;
		System.out.println("O primeiro número é: " + primeiro);
		System.out.println("O segundo número é: " + segundo);
	}
}
