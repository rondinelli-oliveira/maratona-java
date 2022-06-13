package academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio;

public class Aula193Carro {
    private String nome = "Audi";
    private String cor;
    private int ano;

    public Aula193Carro(String cor, int ano) {
        this.cor = cor;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return "Aula193Carro{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", ano=" + ano +
                '}';
    }
}
