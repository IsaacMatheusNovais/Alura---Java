package sintaxes_variaveis_e_fluxo;

public class TesteCondicional {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 18;
		int QuantidadePessoas = 1;
		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos");
			System.out.println("Seja bem vindo");
		} else {
			if (QuantidadePessoas >= 2) {
				System.out.println("Pode entrar pois está acompanhado");
			} else {
				System.out.println("Infelizmente você não pode entrar");
			}
		}
	}
}
