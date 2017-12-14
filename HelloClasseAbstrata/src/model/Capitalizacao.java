package model;

import infra.Logavel;

public class Capitalizacao implements Logavel, Rentavel{

    private ContaPoupanca poupanca;

    public Capitalizacao(Pessoa titular) {
        this.poupanca = new ContaPoupanca(titular);
    }

    // This is not Override!!!
    public void depositar(double valor){
        this.poupanca.depositar(valor);
    }

    public boolean sacar(double valor){
        return this.poupanca.sacar(valor);
    }

    public void render(double taxaMensal){
        poupanca.render(taxaMensal);
    }


    @Override
    public String log() {
        return "Log de capitalizacao";
    }
}
