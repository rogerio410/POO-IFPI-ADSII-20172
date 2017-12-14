package model;

import infra.Logavel;

public class ContaPoupanca extends Conta implements Logavel, Rentavel{

    public ContaPoupanca(Pessoa titular) {
        super(titular);
    }

    public void render(double taxa){
        depositar(obterSaldoReal() * taxa);
    }

    @Override
    public double obterSaldoReal() {
        return obterSaldo();
    }

    @Override
    public String log() {
        return "Dados a registrar..";
    }
}
