package sintaxes_variaveis_e_fluxo;

public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 18;
		//Declaração de variável booleana
		boolean  acompanhado = true;
		//Variável "acompanhado" não precisa de verificador dentro do if,
		//visto que o valor é binário e neste caso true
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Infelizmente você não pode entrar");
		}
	}
}
