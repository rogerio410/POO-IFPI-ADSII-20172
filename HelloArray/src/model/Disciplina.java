package model;

public class Disciplina {

    private String nome;
    private int modulo;

    public Disciplina(String nome, int modulo) {
        this.nome = nome;
        this.modulo = modulo;
    }

    public String getNome() {
        return nome;
    }
}
