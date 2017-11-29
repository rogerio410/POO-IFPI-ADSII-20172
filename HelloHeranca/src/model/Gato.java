package model;

public class Gato extends Animal {

    public Gato(){
        this("sem nome", 4);
    }

    public Gato(String nome, int anos) {
        super(nome, anos);
    }

    @Override
    public String falar() {
        String fala = super.falar();
        return fala + ", Olá eu sou um gato.";
    }

    public String miar(){
        return "Miando: " + falar();
    }

    @Override
    public int getIdadeVirtual() {
        return idadeEmAnos * 4;
    }
}
