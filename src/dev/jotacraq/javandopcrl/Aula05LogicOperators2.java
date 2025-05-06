package dev.jotacraq.javandopcrl;

public class Aula05LogicOperators2 {
    public static void main(String[] args) {
        // && (and)

        float salario = 4612F;
        int idade = 30;

        boolean isCLTDigno = salario > 2412 && idade > 18;

        System.out.println("Eh um CLT digno? " + isCLTDigno);

        String genero = "Hetero";
        boolean comeMulher = true;

        boolean EhMacho = genero == "Hetero" || comeMulher == true;

        System.out.println("Hetero Flex? " + EhMacho);




    }
}
