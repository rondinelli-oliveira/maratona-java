package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public abstract class Aula90Produto implements Aula90Taxavel{
    protected String nome;
    protected double valor;

    public Aula90Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}
