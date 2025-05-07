package dev.jotacraq.javandopcrl;

public class Aula04Operators {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero01 * numero02;
        System.out.println("Valor: "+ resultado);

        // %
        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println("isDezMaiorQueVinte: "+isDezMaiorQueVinte);

        // && (and)

        float salario = 4612F;
        int idade = 30;

        boolean isCLTDigno = salario > 2412 && idade > 18;

        System.out.println("Eh um CLT digno? " + isCLTDigno);

        String genero = "Hetero";
        boolean comeMulher = true;

        boolean EhMacho = genero == "Hetero" || comeMulher == true;

        System.out.println("Hetero Flex? " + EhMacho);

        // = += -= *= /= %=

        double bonus = 1800;
        bonus += 1000;
        bonus -= 500;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        //
        int contador = 0;
        contador += 1; // contador = contador + 1
        contador++;
        contador--;    // Incrementa depois da variavel ser apresentada ou chamada.
        ++contador;    // Incrementa antes da variavel ser apresentada ou chamada.
        --contador;
        int contador2 = 0;
        System.out.println(contador2++);

    }
}
