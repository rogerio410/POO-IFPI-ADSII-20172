package model.empresa;

public class Funcionario {

    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public double getBonificacao(){
        return this.salario * 0.08;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome=" + nome +
                "\ncpf=" + cpf +
                "\nsalario=" + salario +
                "\nbonificacao=" + getBonificacao() +
                '}';
    }
}
