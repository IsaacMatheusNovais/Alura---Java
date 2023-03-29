package sintaxes_variaveis_e_fluxo;

public class TestaWhile {
	public static void main(String[] args) {
		int contador = 0;
		while(contador <= 10) {
			System.out.println(contador);
			//mesma coisa do i++ do JS.
			contador++;
		}
		System.out.println(contador);
	}
}
