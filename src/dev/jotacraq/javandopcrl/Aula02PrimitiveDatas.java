package dev.jotacraq.javandopcrl;

public class Aula02PrimitiveDatas {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int age =  10;
        long bigNumber = (long) 155.23;
        double moneyDouble = 2000.0D;
        float salarioFloat = (float) 2500.0D;
        byte ageByte = 127;
        short ageShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char character = '\u0041';

        System.out.println("A idade eh "+ age +" anos.");
        System.out.println(falso);
        System.out.println("char "+character);
        System.out.println(salarioFloat);
        System.out.println(bigNumber);
    }
}
