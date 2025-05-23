package dev.jotacraq.maratonajava.javacore.Bintroducaometodos.dominio;

// Desafio: Criar uma calculadora que valide se o numero eh primo ou nao
// Retornar true se for e false se nao for

// Desafio: criar uma calculadora que recebe uma lista/array.
// e retorna toda essa lista x2

public class Validador {

    public boolean calculadoraDePrimos(int num1) {
        if (num1 <= 1) {
            return false;
        } else if (num1 % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public int calculadoraX2VarArgs(int... arr) {
        for (int num : arr) {
            System.out.print(num * 2 + " | ");
        }
        return 0;
    }


}