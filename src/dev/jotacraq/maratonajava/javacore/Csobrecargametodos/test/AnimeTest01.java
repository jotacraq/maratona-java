package dev.jotacraq.maratonajava.javacore.Csobrecargametodos.test;

import dev.jotacraq.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akudama Drive", "TV", 12, "Acao");
        anime.imprime();
    }
}
