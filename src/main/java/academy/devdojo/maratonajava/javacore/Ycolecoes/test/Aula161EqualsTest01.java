package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Aula161Smartphone;

public class Aula161EqualsTest01 {
    public static void main(String[] args) {
        Aula161Smartphone s1 = new Aula161Smartphone("1ABC1", "iPhone");
        Aula161Smartphone s2 = new Aula161Smartphone("1ABC1", "iPhone");
        System.out.println(s1.equals(s2));
    }
}