public class Fracao {

    private int numerador;
    private int denominador;

    public Fracao(int n, int d){

        if (d == 0){
            throw new IllegalArgumentException("Denominador não pode ser zero");
        }

        this.numerador = n;
        this.denominador = d;
    }

    public double valorReal(){
        return this.numerador / this.denominador;
    }

    @Override
    public String toString() {
        return String.format("%d/%d", this.numerador, this.denominador);
    }
}
