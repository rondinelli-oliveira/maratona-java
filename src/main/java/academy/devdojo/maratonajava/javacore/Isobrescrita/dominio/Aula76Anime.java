package academy.devdojo.maratonajava.javacore.Isobrescrita.dominio;

public class Aula76Anime {
    private String nome;

    public Aula76Anime(String nome) {
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
        return "Anime{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
