package dev.jotacraq.maratonajava.javacore.Lclassesabstratas.test;

import dev.jotacraq.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import dev.jotacraq.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Joao Pedro", 5000);
        System.out.println(gerente);
        Desenvolvedor desenvolvedor =  new Desenvolvedor("Lucas", 8200);
        System.out.println(desenvolvedor);
    }
}
