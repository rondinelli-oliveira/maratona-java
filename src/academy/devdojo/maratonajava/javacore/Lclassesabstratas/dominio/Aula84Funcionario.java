package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public abstract class Aula84Funcionario {
    protected String nome;
    protected double salario;

    public Aula84Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    public abstract void calculaBonus();

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
