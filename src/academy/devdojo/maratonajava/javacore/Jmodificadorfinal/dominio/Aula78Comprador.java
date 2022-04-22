package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Aula78Comprador {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Comprador{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
