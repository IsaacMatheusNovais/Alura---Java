class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero, Cliente titular) {
		total++;
		this.agencia = agencia;
		this.numero = numero;
		this.titular = titular;
		System.out.println("Conta criada com sucesso, numero da conta: " + numero);
		System.out.println("Esta é a conta de número: " + total);
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if (this.saldo >= valor){
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			return true;		
		} else {
			return false;}
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

