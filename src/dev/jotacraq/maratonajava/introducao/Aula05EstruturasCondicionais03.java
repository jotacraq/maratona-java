package dev.jotacraq.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 5000;
        String mensagemDoar = "Doar salario pro pobre!";
        String mensagemNaoDoar = "Nao doa cara!";
        String resultado = (salario > 3000) ? mensagemNaoDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}
