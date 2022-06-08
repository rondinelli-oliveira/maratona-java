package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

import java.util.Objects;

public class Aula169Produto implements Comparable<Aula169Produto> {
    private Long id;
    private String nome;
    private double preco;
    private int quantidade;

    public Aula169Produto(Long id, String nome, double preco) {
        Objects.requireNonNull(id, "ID nao pode ser nulo!");
        Objects.requireNonNull(nome, "Nome nao pode ser nulo!");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Aula169Produto(Long id, String nome, double preco, int quantidade) {
        this(id, nome, preco);
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Aula169Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aula169Produto produto = (Aula169Produto) o;
        return Objects.equals(id, produto.id) && Objects.equals(nome, produto.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    @Override
    public int compareTo(Aula169Produto obj) {
//         negativo se o this < obj
//         se this == obj, return 0
//         positivo se this > obj
//        if(this.id < obj.getId()){
//            return -1;
//        }else if(this.id.equals(obj.getId())){
//            return 0;
//        }else {
//            return 1;
//        }
        return this.nome.compareTo(obj.getNome());
//        return Double.compare(preco, obj.getPreco());
//        return Double.valueOf(preco).compareTo(obj.getPreco());
//        return this.id.compareTo(obj.getId());
    }
}
