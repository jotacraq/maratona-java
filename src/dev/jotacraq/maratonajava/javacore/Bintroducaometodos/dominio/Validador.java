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

    public int calculadoraX2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] * 2 + " | ");
        }
        return 0;
    }

}