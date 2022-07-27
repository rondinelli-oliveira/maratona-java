package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Aula246Person;

public class Aula246BuilderPatternTest01 {
    public static void main(String[] args) {
        Aula246Person build = new Aula246Person.Aula246PersonBuilder()
                .firstName("Rondinelli")
                .lastName("Oliveira")
                .username("rondinelli413")
                .email("rondinelli413@gmail.com")
                .build();
        System.out.println(build);

    }
}
