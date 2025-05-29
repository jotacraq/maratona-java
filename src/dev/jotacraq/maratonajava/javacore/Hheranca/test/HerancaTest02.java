package dev.jotacraq.maratonajava.javacore.Hheranca.test;

import dev.jotacraq.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    public static void main(String[] args) {
        // 0- Bloco de inicializacao estatico da super classe eh executado quando a JVM carregar a classe
        // 1- bloco de inicializacao estatico da subclasse eh executado quando a JVM carregar a classe filha
        // 2- Alocado espaco em memoria pro objeto da superclasse
        // 3- Cada atributo de superclasse eh criado e inicializado com valores default ou o que for passado da classe pai
        // 3- Bloco de inicializacao da superclasse eh executado na ordem em que aparece
        // 4- Construtor eh executado da superclasse
        // 6- Alocado espaco em memoria pro objeto da subclasse
        // 7- Cada atributo de subclasse eh criado e inicializado com valores default ou o que for passado
        // 8- Bloco de inicializacao da subclasse eh executado na ordem em que aparece
        // 9- Construtor eh executado da subclasse
        Funcionario funcionario = new Funcionario("Joaocraq");
    }
}
