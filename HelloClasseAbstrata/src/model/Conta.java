package model;

public abstract class Conta {

    public int numero;
	private Pessoa titular;
	private double saldo;
	
	public Conta(Pessoa titular) {
		this.titular = titular;
	}
	
	public boolean sacar(double valor){
		if (saldo >= valor){
			saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
	public final void depositar(double valor){
		saldo += valor;
	}
	
	public boolean transferir(double valor, Conta contaDestino) {
		if (this.sacar(valor)) {
			contaDestino.depositar(valor);
			return true;
		}else {
			return false;
		}
	}

	public abstract double obterSaldoReal();
	
	public boolean estaNegativa() {
		return this.saldo < 0;
	}
	
	public String obterSituacao() {
		return (this.estaNegativa() ? "Conta NEGATIVA" : "Conta POSITIVA") + " Saldo: "+this.obterSaldo();
	}
	
	public double obterSaldo() {
		return this.saldo;
	}
	
	public String obterNomeDoTitular() {
		return this.titular.getNome();
	}
	
	public Pessoa getTitular() {
		return titular;
	}

}