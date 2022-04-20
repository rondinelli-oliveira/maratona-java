package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Aula70Seminario {
    private String titulo;
    private Aula70Aluno[] alunos;
    private Aula70Local local;

    public Aula70Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Aula70Seminario(String titulo, Aula70Aluno[] alunos) {
        this.titulo = titulo;
        this.alunos = alunos;
    }

    public Aula70Seminario(String titulo, Aula70Aluno[] alunos, Aula70Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aula70Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aula70Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Aula70Local getLocal() {
        return local;
    }

    public void setLocal(Aula70Local local) {
        this.local = local;
    }
}
