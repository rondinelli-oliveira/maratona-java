package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Aula71Pessoa {
    protected String nome;
    protected String cpf;
    protected Aula71Endereco endereco;

    static {
        System.out.println("Dentro do bloco de inicialização estático de pessoa");
    }

    {
        System.out.println("Dentro do bloco de inicialização de pessoa 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização de pessoa 2 ");
    }

    public Aula71Pessoa(String nome) {
        System.out.println("Dentro do construtor de pessoa");
        this.nome = nome;
    }

    public void imprimeDados() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua() + " " + this.endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Aula71Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Aula71Endereco endereco) {
        this.endereco = endereco;
    }
}
