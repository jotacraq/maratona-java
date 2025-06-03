package dev.jotacraq.maratonajava.javacore.Npolimorfismo.test;

import dev.jotacraq.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import dev.jotacraq.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import dev.jotacraq.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import dev.jotacraq.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto =  new Computador("Ryzen 7 5700x", 2000);

        Tomate tomate =  new Tomate("Americano", 40);
        tomate.setDataValidade("11/12/2025");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println(" ");
        CalculadoraImposto.calcularImposto(produto);
    }
}
