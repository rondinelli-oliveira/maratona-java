package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public final class Aula249AircraftSingletonLazy {

    private static Aula249AircraftSingletonLazy INSTANCE;
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    private Aula249AircraftSingletonLazy(String name) {
        this.name = name;
    }

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public static Aula249AircraftSingletonLazy getINSTANCE() {
        if (INSTANCE == null) {
            synchronized (Aula249AircraftSingletonLazy.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Aula249AircraftSingletonLazy("787-900");
                }
            }
        }
        return INSTANCE;
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }

}
