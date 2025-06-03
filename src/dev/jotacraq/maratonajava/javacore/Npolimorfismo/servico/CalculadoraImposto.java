package dev.jotacraq.maratonajava.javacore.Npolimorfismo.servico;

import dev.jotacraq.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import dev.jotacraq.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import dev.jotacraq.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatorio de Imposto: ");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preco: " + produto.getValor());
        System.out.println("Imposto: " + imposto);
        if (produto instanceof Tomate) {
            String dataValidade = ((Tomate) produto).getDataValidade();
            System.out.println(dataValidade);
        }
    }
}
