package dev.jotacraq.maratonajava.javacore.Npolimorfismo.test;

import dev.jotacraq.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import dev.jotacraq.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio =  new RepositorioBancoDeDados();
        repositorio.salvar();
        List<String> list = new LinkedList<>();
        list.add("Goku");
        list.add("Vegeta");
        list.add("Kuririn");
        System.out.println(list);
    }
}
