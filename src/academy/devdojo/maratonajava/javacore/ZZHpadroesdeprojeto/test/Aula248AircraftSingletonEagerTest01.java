package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Aula248AircraftSingletonEager;

public class Aula248AircraftSingletonEagerTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
        Aula248AircraftTest01.bookSeat("1A");
    }

    private static void bookSeat(String seat) {
        System.out.println(Aula248AircraftSingletonEager.getINSTANCE());
        Aula248AircraftSingletonEager aircraft = Aula248AircraftSingletonEager.getINSTANCE();
        System.out.println(aircraft.bookSeat(seat));
    }
}
