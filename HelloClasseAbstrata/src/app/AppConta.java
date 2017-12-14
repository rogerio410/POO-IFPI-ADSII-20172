package app;

import infra.Log;
import model.*;

public class AppConta {

    public static void main(String[] args) {

//        Conta conta = new Conta();
//        conta.depositar(100);
//        conta.sacar(95);

        Conta conta;
        conta = new ContaPoupanca(new Pessoa("Rogerio da Silva"));
        conta.depositar(1500);

        ContaCorrente contaCorrente = new ContaUniversitaria(new Pessoa("Joao Silva"));
        contaCorrente.depositar(12000);
        contaCorrente.sacar(1000);

        ContaPoupanca contaPoupanca = new ContaPoupanca(new Pessoa("Marieta"));
        contaCorrente.transferir(3000, contaPoupanca);

        Capitalizacao capitalizacao = new Capitalizacao(new Pessoa("Filipe Neiva"));

        capitalizacao.depositar(800);
        capitalizacao.sacar(80);

        System.out.println(conta.obterSituacao());
        System.out.println(contaCorrente.obterSituacao());
        System.out.println(contaPoupanca.obterSituacao());

        Log.logObject(contaPoupanca);
        Log.logObject(capitalizacao);

        //Aplicar Rendimentos
        AplicadorDeRendimentos aplicador = new AplicadorDeRendimentos();
        aplicador.aplicarRendimentoMensal(contaPoupanca);
        aplicador.aplicarRendimentoMensal(capitalizacao);


    }
    
}





