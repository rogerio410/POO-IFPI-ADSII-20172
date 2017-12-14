package model;

public class AplicadorDeRendimentos {

    public void aplicarRendimentoMensal(Rentavel coisa){
        coisa.render(getTaxaMensal());
    }

    public double getTaxaMensal() {
        double taxa = 0.00678; //Chama um algoritmo de calculo de taxa mensal de rendimento no sitema financeiros
        return taxa;
    }
}
