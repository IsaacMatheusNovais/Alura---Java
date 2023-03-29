package sintaxes_variaveis_e_fluxo;

class DesafioFatorial {
	public static void main(String[] args) {
		// Ele altera a variável fatorial dentro do laço
		// de modo que ela grava o ultimo valor da conta
		// e refaz a operação baseada nesa ultima memória
		int fatorial = 1;
		for (int i = 1; i < 11; i++) {
			// fatorial = fatorial * i
			fatorial *= i;
			System.out.println("Fatorial de " + i + " = " + fatorial);
		}
	}
}
