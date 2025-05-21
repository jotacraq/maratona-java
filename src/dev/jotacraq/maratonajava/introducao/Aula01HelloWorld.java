package dev.jotacraq.maratonajava.introducao;

import dev.jotacraq.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class Aula01HelloWorld {
    public static void main(String[] args) {
        // Exemplo de uso de comentario
        System.out.println("KA-ME-HA-ME-HA");
        Carro carro = new Carro();
        carro.nome = "monza";
        System.out.println(carro.toString());
    }
}
