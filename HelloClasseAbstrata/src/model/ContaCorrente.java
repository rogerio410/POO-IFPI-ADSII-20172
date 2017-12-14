package model;

public class ContaCorrente extends Conta {

    private double tarifa;

    public ContaCorrente(Pessoa titular) {
        super(titular);
    }

    @Override
    public boolean sacar(double valor) {
        //retirar tarifa
        tarifarSaque();
        return super.sacar(valor);
    }

    @Override
    public double obterSaldoReal() {
        return 0;
    }

    private void tarifarSaque() {
        //Tarifar..
    }

    @Override
    public double obterSaldo() {
        //Saldo mais limite
        return super.obterSaldo();
    }

    private void tarifarDeposito() {

    }
}
