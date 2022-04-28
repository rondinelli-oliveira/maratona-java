package academy.devdojo.maratonajava.javacore.Uregex.test;

public class Aula137ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Rondinelli, Gabriel, Flávia";
        String[] nomes = texto.split(",");
        for (String nome : nomes) {
            System.out.println(nome.trim());
        }
    }
}
