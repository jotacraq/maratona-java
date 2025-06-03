package dev.jotacraq.maratonajava.javacore.Npolimorfismo.test;

import dev.jotacraq.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import dev.jotacraq.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import dev.jotacraq.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9 7500x", 3800);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println(" ");
        Produto produto2 = new Tomate("Americano", 380);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
    }
}
