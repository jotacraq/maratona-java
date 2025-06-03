package dev.jotacraq.maratonajava.javacore.Npolimorfismo.test;

import dev.jotacraq.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import dev.jotacraq.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import dev.jotacraq.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import dev.jotacraq.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Acer Nitro 5x", 3560);
        Tomate tomate =  new Tomate("Tomate do Himalaia", 82);
        Televisao tv =  new Televisao("Samsung 50\" ", 5000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println(" ");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println(" ");
        CalculadoraImposto.calcularImposto(tv);
    }
}
