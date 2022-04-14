package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Aula64Jogador {
    private String nome;

    public void imprimeDados() {
        System.out.println(this.nome);
    }

    public Aula64Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
