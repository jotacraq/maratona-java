package dev.jotacraq.maratonajava.javacore.Aintroducaoclasses.teste;

import dev.jotacraq.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Honda Civic";
        carro1.modelo = "1.8 Hybrid";
        carro1.ano = 2023;

        carro2.nome = "Grand Siena";
        carro2.modelo = "1.4 EcoSport";
        carro2.ano = 2015;

        System.out.println("Carro 1: " + carro1.nome + " | Modelo: " + carro1.modelo + " | Ano: " + carro1.ano);
        System.out.println("Carro 2: " + carro2.nome + " | Modelo: " + carro2.modelo + " | Ano: " + carro2.ano);

    }
}
