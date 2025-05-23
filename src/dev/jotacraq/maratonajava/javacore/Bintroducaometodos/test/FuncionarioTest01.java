package dev.jotacraq.maratonajava.javacore.Bintroducaometodos.test;

import dev.jotacraq.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Edson");
        funcionario.setIdade(33);
        funcionario.setSalarios(new double[]{2450.5F, 3420, 5220.5F, 2200});

        funcionario.imprime();
        System.out.println(funcionario.getMedia());
    }
}
