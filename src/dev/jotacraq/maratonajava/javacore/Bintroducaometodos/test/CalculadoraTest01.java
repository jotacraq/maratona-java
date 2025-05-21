package dev.jotacraq.maratonajava.javacore.Bintroducaometodos.test;

import dev.jotacraq.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

import static dev.jotacraq.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora.somaDoisNumeros;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        // Uso de public static pegando o objeto original
        int resultadoSoma = somaDoisNumeros(10, 20);
        System.out.println(resultadoSoma);

        // Uso de public int com a finalidade de pegar uma copia do objeto
        int resultadoSubtracao = calculadora.subtraiDoisNumeros(100, 20);
        System.out.println(resultadoSubtracao);

    }
}

// Quando Instanciamos um objetos usando, pegamos uma copia do objeto usando public int ou a variavel desejada.
// Quando pegamos o original, pegamos o objeto em si, usamos o public static para usar somente uma vez.
