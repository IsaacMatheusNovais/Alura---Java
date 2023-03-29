package sintaxes_variaveis_e_fluxo;

public class TestaEscopo {
	public static void main(String[] args) {
		
		System.out.println("Testando condicionais");
		int idade = 18;
		int QuantidadeDePessoas = 1;
		boolean Acompanhado;
		
		// Altomatização de variável booleana
		if (QuantidadeDePessoas >= 2) {
			Acompanhado = true;
		} else {
			Acompanhado = false;
		}
		
		// Variável "acompanhado" não precisa de verificador dentro do if,
		// visto que o valor é binário e neste caso true.
		if (idade >= 18 && Acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Infelizmente você não pode entrar");
		}
	}
}
