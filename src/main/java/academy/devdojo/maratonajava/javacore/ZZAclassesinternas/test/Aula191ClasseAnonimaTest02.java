package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Aula186Barco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//class BarcoNameComparator implements Comparator<Aula186Barco> {
//
//    @Override
//    public int compare(Aula186Barco o1, Aula186Barco o2) {
//        return o1.getNome().compareTo(o2.getNome());
//    }
//}

public class Aula191ClasseAnonimaTest02 {
    public static void main(String[] args) {
        List<Aula186Barco> barcoList = new ArrayList<>(
                List.of(new Aula186Barco("Perola Negra"),
                        new Aula186Barco("Holandes Voador")));

        barcoList.sort(new Comparator<Aula186Barco>() {
            @Override
            public int compare(Aula186Barco o1, Aula186Barco o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });

        System.out.println(barcoList);
    }
}
