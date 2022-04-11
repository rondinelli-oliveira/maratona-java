package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("Executando a soma");
        calculadora.somaNumeros();
        System.out.println("Finalizando soma.");
        System.out.println("Executando a subtração");
        calculadora.subtraiDoisNumeros();
        System.out.println("Finalizando subtração.");
    }
}
