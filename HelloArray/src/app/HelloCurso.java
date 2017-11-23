package app;

import model.Aluno;
import model.Curso;
import model.Disciplina;
import model.Turma;

public class HelloCurso {

    public static void main(String[] args) {

        Curso ads = new Curso("ADS", "Superior");
        Disciplina poo = new Disciplina("POO", 2);
        Disciplina ed = new Disciplina("ED", 2);

        Turma turmaa = new Turma(ads, poo, 40);

        //matricula N alunos
        for (int i = 0; i < 10; i++) {
            Aluno aluno = new Aluno("Aluno_" + i, ""+i);
            turmaa.matricular(aluno);
        }

        Turma turmab = new Turma(ads, ed, 30);

        //MOstrar Situacao da Turma
        System.out.println(turmaa);
        System.out.println(turmab);

        System.out.println(Turma.tchau());
        System.out.println(Turma.tchau());



    }

}
