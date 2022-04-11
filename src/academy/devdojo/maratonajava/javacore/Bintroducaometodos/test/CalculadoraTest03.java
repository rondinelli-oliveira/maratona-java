package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("Executando a divisão");
        double result = calculadora.divideDoisNumeros2(15, 3);
        System.out.println(result);
        System.out.println("Finalizando divisão.");
    }
}
