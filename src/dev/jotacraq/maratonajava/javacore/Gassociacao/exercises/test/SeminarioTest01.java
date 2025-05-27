package dev.jotacraq.maratonajava.javacore.Gassociacao.exercises.test;

import dev.jotacraq.maratonajava.javacore.Gassociacao.exercises.dominio.Aluno;
import dev.jotacraq.maratonajava.javacore.Gassociacao.exercises.dominio.Local;
import dev.jotacraq.maratonajava.javacore.Gassociacao.exercises.dominio.Professor;
import dev.jotacraq.maratonajava.javacore.Gassociacao.exercises.dominio.Seminario;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Thayron", 21);
        Aluno aluno2 = new Aluno("Vinicius", 28);
        Aluno aluno3 = new Aluno("Addae", 25);
        Aluno aluno4 = new Aluno("Tobias", 19);

        Aluno[] alunos1 = {aluno1, aluno2};
        Aluno[] alunos2 = {aluno3, aluno4};

        Professor professor1 = new Professor("Wilton", "Teologia");
        Professor professor2 = new Professor("Josefino", "Filosofia");

        Seminario seminario1 = new Seminario("Seminario Sao Jose");
        Seminario seminario2 = new Seminario("Seminario Santo Agostinho");

        Seminario[] seminarios = {seminario1, seminario2};

        Local local1 = new Local("Botafogo");
        Local local2 = new Local("Flamengo");

        seminario1.setLocal(local2);
        seminario2.setLocal(local1);

        seminario1.setAlunos(alunos1);
        seminario2.setAlunos(alunos2);

        System.out.println("-------------- Seminario --------------");
        seminario1.imprime();
        seminario2.imprime();

        professor1.setSeminarios(seminarios);
        professor2.setSeminarios(seminarios);

        System.out.println("------------- Professores -------------");
        professor1.imprime();
        professor2.imprime();
    }
}

