package model;

public class Turma {

    public static int contador = 0;
    private int codigo;
    private Curso curso;
    private Disciplina disciplina;
    private Aluno[] alunos;
    private int pos;

    public Turma(Curso c, Disciplina d, int qtdAlunos){
        this.codigo = Turma.contador++;
        this.curso = c;
        this.disciplina = d;
        this.alunos = new Aluno[qtdAlunos];
        this.pos = 0;
    }

    public boolean matricular(Aluno aluno){
        this.alunos[pos++] = aluno;
        return false;
    }

    public int qtdVagasTotal(){
        return this.alunos.length;
    }

    public int qtdVagasOcupadas(){
        return this.pos;
    }

    public int qtdVagasLivres(){
        return this.qtdVagasTotal() - this.qtdVagasOcupadas();
    }

    public boolean temVaga(){
        return qtdVagasLivres() > 0;
    }

    public static String tchau(){
        return "Tchau...";
    }

    public String toString(){
        String s = "Situacao da Turma \n";
        s += "Codigo: " + this.codigo + "\n";
        s += "Curso: " + this.curso.getNome() + "\n";
        s += "Disciplina: " + this.disciplina.getNome() + "\n";
        s += "Vagas-Total/Matriculas: " + this.qtdVagasTotal() +" / " + this.qtdVagasOcupadas() + "\n";
        s += "Alunos: \n";
        for (int i = 0; i < qtdVagasOcupadas(); i++) {
            Aluno aluno = this.alunos[i];
            s += "> " + aluno.getNome() + "\n";
        }
        return s;
    }

}
