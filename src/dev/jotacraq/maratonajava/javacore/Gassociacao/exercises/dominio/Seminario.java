package dev.jotacraq.maratonajava.javacore.Gassociacao.exercises.dominio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public void imprime() {
        String endereco = (local != null) ? local.getEndereco() : "Local não definido";
        System.out.println(titulo + " | " + endereco);

        if (alunos != null && alunos.length > 0) {
            for (Aluno aluno : alunos) {
                if (aluno != null) {
                    System.out.println(aluno.getNome() + " | " + aluno.getIdade());
                }
            }
        } else {
            System.out.println("Nenhum aluno inscrito.");
        }

        System.out.println();
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}



