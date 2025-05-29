package dev.jotacraq.maratonajava.javacore.Hheranca.test;

import dev.jotacraq.maratonajava.javacore.Hheranca.dominio.Endereco;
import dev.jotacraq.maratonajava.javacore.Hheranca.dominio.Funcionario;
import dev.jotacraq.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco =  new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("02112-202");
        Pessoa pessoa = new Pessoa("Joao Pedro");
        pessoa.setCpf("123.456.789-10");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        System.out.println("----------------");
        Funcionario funcionario = new Funcionario("Rodrigo Barreto");
        funcionario.setEndereco(endereco);
        funcionario.setCpf("123.456.789-10");
        funcionario.setSalario(1140);

        funcionario.imprime();

    }
}
