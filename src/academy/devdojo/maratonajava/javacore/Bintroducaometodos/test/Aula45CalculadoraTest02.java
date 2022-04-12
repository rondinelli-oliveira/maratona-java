package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Aula44Calculadora;

public class Aula45CalculadoraTest02 {
    public static void main(String[] args) {
        Aula44Calculadora calculadora = new Aula44Calculadora();
        System.out.println("Executando a multiplicação");
        calculadora.mutiplicaDoisNumeros(10, 20);
        System.out.println("Finalizando multiplicação.");
        System.out.println("Executando a divisão");
        calculadora.divideDoisNumeros(15, 3);
        System.out.println("Finalizando divisão.");
    }
}
