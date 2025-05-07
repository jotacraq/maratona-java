package dev.jotacraq.javandopcrl;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {

        int age = 15;
        boolean isAutorizadoComprarBebida = age >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Pode comprar bebida alcoolica");
        }else {
            System.out.println("Nao pode pai, daq a pouco voce volta!");
        }

        boolean c = false;

        if (c = true) {
            System.out.println("Dento de algo que nunca deve ser feito");
        }

    }
}
