package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Aula71Pessoa {
    private String nome;
    private String cpf;
    private Aula71Endereco endereco;

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
