public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		total++;
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Conta criada com sucesso, numero da conta: " + numero);
		System.out.println("Esta é a conta de número: " + total);
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public abstract void deposita(double valor);
	
	public void saca(double valor) {
		if (this.saldo < valor){
			throw new SaldoInsuficienteException("saldo: " + this.saldo + ", valor: "
			+ valor);
		} 
		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta destino) {
		this.saca(valor);
			destino.deposita(valor);
			}
	
	public int getNumero() {
		return this.numero;
	}

	
	public int getAgencia() {
		return agencia;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal(){
		return Conta.total;
	}
}

