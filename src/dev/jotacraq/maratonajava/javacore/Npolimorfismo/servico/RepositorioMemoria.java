package dev.jotacraq.maratonajava.javacore.Npolimorfismo.servico;

import dev.jotacraq.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memoria...");
    }
}
