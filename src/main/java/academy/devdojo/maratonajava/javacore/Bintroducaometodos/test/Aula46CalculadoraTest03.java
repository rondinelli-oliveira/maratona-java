package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Aula44Calculadora;

public class Aula46CalculadoraTest03 {
    public static void main(String[] args) {
        Aula44Calculadora calculadora = new Aula44Calculadora();
        System.out.println("Executando a divisão");
        double result = calculadora.divideDoisNumeros2(15, 3);
        System.out.println(result);
        System.out.println("Finalizando divisão.");
        System.out.println(calculadora.divideDoisNumeros3(4, 0));
        calculadora.imprimeDivideDoisNumeros3(3, 0);
    }
}
