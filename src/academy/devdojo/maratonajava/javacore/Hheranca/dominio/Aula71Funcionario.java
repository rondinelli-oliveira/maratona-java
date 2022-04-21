package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Aula71Funcionario extends Aula71Pessoa {
    private double salario;

    public void imprimeDados() {
        super.imprimeDados();
        System.out.println(this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
