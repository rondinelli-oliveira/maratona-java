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
        boolean isDezMaiorIgualQueVinte = 10 >= 20;
        boolean isDezMenorIgualQueVinte = 10 <= 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteVinte = 10 != 20;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("DezMaiorQueVinte: " + isDezMaiorQueVinte);
        System.out.println("DezMenorQueVinte: " + isDezMenorQueVinte);
        System.out.println("DezMaiorIgualQueVinte: " + isDezMaiorIgualQueVinte);
        System.out.println("DezMenorIgualQueVinte: " + isDezMenorIgualQueVinte);
        System.out.println("DezIgualVinte: " + isDezIgualVinte);
        System.out.println("DezIgualDez: " + isDezIgualDez);
        System.out.println("DezDiferenteVinte: " + isDezDiferenteVinte);
        System.out.println("DezDiferenteDez: " + isDezDiferenteDez);

        // operadores de lógicos
        // && (AND) || (OU) ! (NOT)
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade >= 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta" + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta" + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlayStation = 5000F;
        boolean isPlayStationCincoCompravel = valorTotalContaCorrente > valorPlayStation || valorTotalContaPoupanca > valorPlayStation;

        System.out.println("PlayStationCincoCompravel"+ isPlayStationCincoCompravel);
    }

}
