package app;

import exceptions.SaldoInsuficienteException;
import model.Conta;

import java.io.IOException;

public class Principal {

    public static void main(String[] args) {

        Conta conta = new Conta(300);

         conta.depositar(1000);

        double valor = 200;
        if (conta.getSaldo() >= valor)
            try {
                conta.sacar(valor);
            } catch (SaldoInsuficienteException e) {
                System.out.println("Vc ta sem grana!");
            }


        try {
            conta.sacar(200);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Liso...");
        }


        try{
            conta.depositar(-1000);
        }catch (IllegalArgumentException e){
            System.out.println("Nao é possível depositar.");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            conta.sacar(400);
        } catch (SaldoInsuficienteException e) {
            e.printStackTrace();
        }

        System.out.println(conta);

    }
}
