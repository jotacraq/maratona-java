package dev.jotacraq.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;
    // 0- Bloco de inicializacao eh executado quando a JVM carregar a classe
    // 1- Alocado espaco em memoria pro objeto
    // 2- Cada atributo de classe eh criado e inicializado com valores default ou o que for passado
    // 3- Bloco de inicializacao eh executado
    // 4- Construtor eh executado

    static {
        System.out.println("Dentro do bloco de inicializacao estatico 1");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicializacao estatico 2");
    }

    static {
        System.out.println("Dentro do bloco de inicializacao estatico 3");
    }

    {
        System.out.println("Dentro do bloco de inicializacao nao estatico!");
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
    }
}
