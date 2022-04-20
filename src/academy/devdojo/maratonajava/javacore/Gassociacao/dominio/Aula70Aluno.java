package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Aula70Aluno {
    private String nome;
    private int idade;
    private Aula70Seminario seminario;

    public Aula70Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
