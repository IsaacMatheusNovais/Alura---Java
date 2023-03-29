package sintaxes_variaveis_e_fluxo;

public class TesteIR {

    public static void main(String[] args) {

        double salario = 4664.00;

        if (salario > 1899.99 && salario < 2800.01 ) {
        	System.out.println("O seu IR é de 7.5% e pode deduzir na declaração o valor de R$ 142");
        } else {
        	if (salario > 2800.00 && salario < 3751.01) {
        		System.out.println("O seu IR é de 15% e pode deduzir R$ 350");
        	} else {
        		if (salario > 3751.00 && salario < 4664.01) {
        			System.out.println("O seu IR é de 22.5% e pode deduzir R$ 636");
        		}
        	}
        }
    }
}