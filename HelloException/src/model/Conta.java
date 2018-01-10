package model;

import exceptions.LimitePorSaqueUltrapassadoException;
import exceptions.SaldoInsuficienteException;

public class Conta {

    private double saldo;
    private double limitePorSaque;

    public Conta(double limiteDiario) {
        this.limitePorSaque = limiteDiario;
    }

    public void depositar(double valor){
        //fail fast
        if (valor <= 0){
            //avisar valor invalido.
            throw new IllegalArgumentException("Valor menor ou igual a zero");
        }

        this.saldo += valor;
    }

    public void sacar(double valor) throws SaldoInsuficienteException{

        if (valor <= 0){
            throw new IllegalArgumentException("Valor menor ou igual a zero");
        }

        if (getSaldo() < valor){
            throw new SaldoInsuficienteException();
        }

        if (valor >= limitePorSaque){
            throw new LimitePorSaqueUltrapassadoException();
        }

        this.saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                '}';
    }
}
