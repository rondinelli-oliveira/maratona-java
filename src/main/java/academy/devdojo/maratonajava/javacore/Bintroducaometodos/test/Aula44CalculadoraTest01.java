package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Aula44Calculadora;

public class Aula44CalculadoraTest01 {
    public static void main(String[] args) {
        Aula44Calculadora calculadora = new Aula44Calculadora();
        System.out.println("Executando a soma");
        calculadora.somaNumeros();
        System.out.println("Finalizando soma.");
        System.out.println("Executando a subtração");
        calculadora.subtraiDoisNumeros();
        System.out.println("Finalizando subtração.");
    }
}
