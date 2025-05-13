package dev.jotacraq.javandopcrl;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Utilizando switch e dado os valores de 1 a 7, imprima se eh dia util ou final de semana
        // Considerando 1 como Domingo

        byte dia = 6;

        switch (dia) {
            case 1:
                System.out.println("Final de Semana");
                break;
            case 2:
                System.out.println("Dia util");
                break;
            case 3:
                System.out.println("Dia util");
                break;
            case 4:
                System.out.println("Dia util");
                break;
            case 5:
                System.out.println("Dia util");
                break;
            case 6:
                System.out.println("Dia util");
                break;
            case 7:
                System.out.println("Final de Semana");
                break;
            default:
                System.out.println("Opcao Invalida!");
                break;
        }
    }
}
