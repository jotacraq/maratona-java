package dev.jotacraq.maratonajava.javacore.Bintroducaometodos.test;

import dev.jotacraq.maratonajava.javacore.Bintroducaometodos.dominio.Validador;

public class ValidadorTest01 {
    public static void main(String[] args) {
        Validador validador = new Validador();
        boolean validacao = validador.calculadoraDePrimos(12);
        System.out.println(validacao);

        validador.calculadoraX2VarArgs(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }
}
