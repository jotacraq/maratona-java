package dev.jotacraq.maratonajava.javacore.Bintroducaometodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    public void imprime() {
        System.out.println("-----------------");

        System.out.print(this.nome + " | ");
        System.out.print(this.sexo + " | ");
        System.out.println(this.idade + " ");
    }
}
