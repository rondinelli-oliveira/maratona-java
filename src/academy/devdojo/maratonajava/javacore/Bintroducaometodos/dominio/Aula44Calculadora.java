package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Aula44Calculadora {

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

    public double divideDoisNumeros3(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            return 0;
        }
    }

    public void imprimeDivideDoisNumeros3(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por zero.");
            return;
        } else {
            System.out.println(num1 / num2);
        }
    }

    public void alteraDoisNumeros(int numero1, int numero2) {
        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Numero1 " + numero1);
        System.out.println("Numero2 " + numero2);
    }
}
