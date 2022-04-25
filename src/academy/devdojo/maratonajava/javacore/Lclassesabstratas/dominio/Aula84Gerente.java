package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public class Aula84Gerente extends Aula84Funcionario{
    public Aula84Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
