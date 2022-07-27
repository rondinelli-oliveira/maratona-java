package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Aula64Jogador {
    private String nome;
    private Aula65Time time;

    public void imprimeDados() {
        System.out.println(this.nome);
        if (time != null) {
            System.out.println(time.getNome());
        }
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

    public Aula65Time getTime() {
        return time;
    }

    public void setTime(Aula65Time time) {
        this.time = time;
    }
}
