package model;

public class Curso {

    private String nome;
    private String nivel;

    public Curso(String nome){
        this(nome, "Basico");
    }

    public Curso(String nome, String nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return this.nome + " - " + this.nivel;
    }
}
