package dev.jotacraq.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public static int somaDoisNumeros(int num1, int num2) {
        System.out.println("Iniciando Funcao de Soma...");
        return num1 + num2;
    }

    public int subtraiDoisNumeros(int num1, int num2) {
        System.out.println("Iniciando Funcao de Subtracao...");
        return num1 - num2;
    }

    public void multiplicaDoisNumeros(int num1, float num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public double divideDoisNumeros02(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        } else {
            return num1 / num2;
        }
    }

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Nao existe divisao por 0!");
            return; // Esse return vai voltar pro CalculadoraTest03 e caso o num2 seja igual a 0 retorna 0 no resultado do bloco de codigo.
        }
        System.out.println(num1 / num2);
    }

    public void alteraDoisNumeros(int numero1, int numero2) {
        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1: "+ numero1);
        System.out.println("Num2: "+ numero2);
    }
}

// Obs: public/private/default/protected -> modificador de acesso.
//      void -> tipo de retorno Ex: void nao retorna nenhum valor para a classe.
//      funcao(parametros -> espacos de memorias que serao recebidas de outra package ou class para ser usada na funcao.) -> bloco de codigo que realizara determinada acao quando chamada.
