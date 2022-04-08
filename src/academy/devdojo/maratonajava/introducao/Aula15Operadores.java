package academy.devdojo.maratonajava.introducao;

public class Aula15Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;

        System.out.println(numero02 + numero01);
        System.out.println(numero02 - numero01);
        System.out.println(numero02 / numero01);
        System.out.println(numero02 * numero01);

        // % resto
        int resto = 20 % 2;
        System.out.println(resto);

        // operadores de comparação
        // < > <= >= ==(igual) !=(diferente)
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteVinte = 10 != 20;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("DezMaiorQueVinte: " + isDezMaiorQueVinte);
        System.out.println("DezMenorQueVinte: " + isDezMenorQueVinte);
        System.out.println("DezIgualVinte: " + isDezIgualVinte);
        System.out.println("DezIgualDez: " + isDezIgualDez);
        System.out.println("DezDiferenteVinte: " + isDezDiferenteVinte);
        System.out.println("DezDiferenteDez: " + isDezDiferenteDez);
    }

}
