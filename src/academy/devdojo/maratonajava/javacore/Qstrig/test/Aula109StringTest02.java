package academy.devdojo.maratonajava.javacore.Qstrig.test;

public class Aula109StringTest02 {
    public static void main(String[] args) {
        String nome = "Rondinelli";
        String numeros = "012345";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("l","__"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.substring(0,2));
        System.out.println(numeros.substring(3));
        System.out.println(nome.trim());
    }
}
