package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    public void mutiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public void divideDoisNumeros(int num1, int num2) {
        System.out.println(num1 / num2);
    }

    public double divideDoisNumeros2(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }
}
