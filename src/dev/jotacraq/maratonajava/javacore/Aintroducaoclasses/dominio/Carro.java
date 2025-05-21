package dev.jotacraq.maratonajava.javacore.Aintroducaoclasses.dominio;

public class Carro {
    public String nome;
    public String modelo;
    public int ano;

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                '}';
    }
}

// public - acessivel a todos os dominios, pacotes e classes, podendo ser acessado pelo import
// private - limita a apenas a classe
// protected - limita a apenas o pacote e classe
