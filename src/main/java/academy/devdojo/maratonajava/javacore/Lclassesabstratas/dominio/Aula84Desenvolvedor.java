package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public class Aula84Desenvolvedor extends Aula84Funcionario {
    public Aula84Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus() {
        this.salario = this.salario + this.salario * 0.05;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
