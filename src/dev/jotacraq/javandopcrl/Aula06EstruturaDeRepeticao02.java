package dev.jotacraq.javandopcrl;

public class Aula06EstruturaDeRepeticao02 {
    public static void main(String[] args) {
        // Imprima todos os numeros pares ate 0 ate 1000000
        for (int i = 0; i < 100000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
