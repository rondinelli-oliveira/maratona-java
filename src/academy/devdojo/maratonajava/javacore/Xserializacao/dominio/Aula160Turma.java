package academy.devdojo.maratonajava.javacore.Xserializacao.dominio;

public class Aula160Turma {
    private String nome;

    public Aula160Turma(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aula160Turma{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
