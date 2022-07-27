package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Aula65Time {
    private String nome;
    private Aula64Jogador[] jogadores;

    public Aula65Time(String nome) {
        this.nome = nome;
    }

    public Aula65Time(String nome, Aula64Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public void imprimeDados() {
        System.out.println(this.nome);
        if (jogadores == null) return;
        for (Aula64Jogador jogador : jogadores) {
            System.out.println(jogador.getNome());
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aula64Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Aula64Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
}
