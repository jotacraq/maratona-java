package dev.jotacraq.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante) {
        System.out.println("-----------------");

        System.out.print(estudante.nome + " | ");
        System.out.print(estudante.sexo + " | ");
        System.out.println(estudante.idade + " ");
    }
}
