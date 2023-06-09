
public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
		}
	@Override
	public void saca(double valor) {
		double valorASacar = valor + 0.20;
		super.saca(valorASacar); }
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
}
