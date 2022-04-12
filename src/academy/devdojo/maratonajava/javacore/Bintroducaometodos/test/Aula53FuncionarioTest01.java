package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Aula53Funcionario;

public class Aula53FuncionarioTest01 {
    public static void main(String[] args) {
        Aula53Funcionario funcionario = new Aula53Funcionario();
        funcionario.setNome("Seya");
        funcionario.setIdade(23);
        funcionario.setSalarios(new double[]{1200, 987.32, 2000});

        funcionario.imprimedados();
        System.out.println("\nMédia" + funcionario.getMedia());
    }
}