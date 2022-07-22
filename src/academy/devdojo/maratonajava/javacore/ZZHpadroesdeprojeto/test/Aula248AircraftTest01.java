package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Aula248AircraftSingletonEager;

public class Aula248AircraftTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    static void bookSeat(String seat) {
        System.out.println(Aula248AircraftSingletonEager.getINSTANCE());
//        Aula248Aircraft aircraft = new Aula248Aircraft("787-900");
//        System.out.println(aircraft.bookSeat(seat));
    }
}