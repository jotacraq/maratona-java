package dev.jotacraq.javandopcrl;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
//  Taxas da Holanda 2020:
//  € 0	     € 34,712   9.70%
//  € 34,713 € 68,507	37.35%
//  € 68,508	        49.50%

        double anualSalary = 45400;
        double anualTaxes = 0;
        double primeiraFaixa = 9 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;

        if (anualSalary >= 0 && anualSalary <= 34712) {
            anualTaxes = anualSalary * primeiraFaixa;
        } else if (anualSalary >= 34713 && anualSalary <= 68507) {
            anualTaxes = anualSalary * segundaFaixa;
        } else {
            anualTaxes = anualSalary * terceiraFaixa;
        }
        System.out.println("Seu Salario de "+anualSalary+" recebera taxa de: "+anualTaxes+" anuais.");
    }
}
