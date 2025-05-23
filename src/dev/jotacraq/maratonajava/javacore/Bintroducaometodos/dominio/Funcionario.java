package dev.jotacraq.maratonajava.javacore.Bintroducaometodos.dominio;


//Crie uma classe Funcionario com os seguintes atributos
//
// nome, idade e salario // tres salarios devem ser guardados
//
// Crie dois metodos

//1. Para imprimir os dados
//2. Para tirar a media dos salarios e imprimir o resultado


public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;


    public void imprime() {
        System.out.print(this.nome + " | ");
        System.out.println(this.idade + " | ");
        if (salarios == null) {
            return;
        }
            for (double salarios : salarios) {
                System.out.println(salarios + " | ");
            }
    }

    public void mediaFuncionarios() {
        if (salarios == null) {
            return;
        }
        double media = 0;
            for (double salario : salarios) {
                media += salario;
            }
            media /= salarios.length;
        System.out.println("Media Total: " + media);
    }

}
