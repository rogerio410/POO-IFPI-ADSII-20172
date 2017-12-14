package model;

public class ContaUniversitaria extends ContaCorrente {

    public final double TAXA = 0.99;

    public ContaUniversitaria(Pessoa titular) {
        super(titular);
    }

    @Override
    public String obterSituacao() {
        return "TODO";
    }
}
