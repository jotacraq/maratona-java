package dev.jotacraq.maratonajava.javacore.Bintroducaometodos.dominio;


//Crie uma classe Funcionario com os seguintes atributos
//
// nome, idade e salario // tres salarios devem ser guardados
//
// Crie dois metodos

//1. Para imprimir os dados
//2. Para tirar a media dos salarios e imprimir o resultado


public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media = 0;

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

    public void imprimeMediaSalario() {
        if (salarios == null) {
            return;
        }

        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMedia() {
        imprimeMediaSalario();
        return media;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
