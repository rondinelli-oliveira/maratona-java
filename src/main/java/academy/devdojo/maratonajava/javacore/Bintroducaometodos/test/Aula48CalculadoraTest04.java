package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Aula44Calculadora;

public class Aula48CalculadoraTest04 {
    public static void main(String[] args) {
        Aula44Calculadora calculadora = new Aula44Calculadora();
        int a = 1;
        int b = 2;
        calculadora.alteraDoisNumeros(a, b);
        System.out.println("Dentro Aula48CalculadoraTest04");
        System.out.println("Num1 " + a);
        System.out.println("Num2 " + b);
    }
}
