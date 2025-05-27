package dev.jotacraq.maratonajava.javacore.Dconstrutores.test;

import dev.jotacraq.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "TV", 12, "Acao", "Production");
        anime.imprime();
    }
}
