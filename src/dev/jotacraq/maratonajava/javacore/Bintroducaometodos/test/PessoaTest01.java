package dev.jotacraq.maratonajava.javacore.Bintroducaometodos.test;

import dev.jotacraq.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
//        pessoa.nome = "Jiraya";
        pessoa.setNome("Jiraya");
        pessoa.setIdade(23);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
