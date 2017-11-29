package model.empresa;

public class Gerente extends Funcionario{

    private String senha;
    private int qtdFuncionariosGerenciados;

    public Gerente(String nome, String cpf, double salario, String senha) {
        super(nome, cpf, salario);
        this.senha = senha;
    }

    @Override
    public double getBonificacao(){
        return super.getBonificacao() + 1000;
    }

}
