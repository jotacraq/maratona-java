package dev.jotacraq.maratonajava.javacore.Gassociacao.exercises.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void imprime() {
        System.out.print(nome + " | ");
        System.out.println(especialidade + " | ");
        if (seminarios == null) return;
        for (Seminario seminario : seminarios) {
            System.out.println(seminario.getTitulo());
        }
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}


