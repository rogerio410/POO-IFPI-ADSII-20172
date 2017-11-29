package model;

public class Animal {

    private String nome;
    protected int idadeEmAnos;

    public Animal(String nome, int anos) {
        this.nome = nome;
        this.idadeEmAnos = anos;
    }

    public String falar(){
        return "Olá eu sou animal.";
    }

    public String getNome() {
        return nome;
    }

    public int getIdadeEmAnos() {
        return idadeEmAnos;
    }

    public int getIdadeVirtual(){
        return getIdadeEmAnos();
    }
}
