package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Aula77Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Aula78Comprador COMPRADOR = new Aula78Comprador();

    public final void imprimeDados() {
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
