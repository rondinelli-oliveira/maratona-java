package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Aula71Funcionario extends Aula71Pessoa {
    private double salario;

    static {
        System.out.println("Dentro do bloco de inicialização estático de funcionário");
    }

    {
        System.out.println("Dentro do bloco de inicialização de funcionário 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização de funcionário 2 ");
    }

    public Aula71Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtio de funcionário");
    }

    public void imprimeDados() {
        super.imprimeDados();
        System.out.println(this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu " + this.nome + " recebi o salário de: " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
