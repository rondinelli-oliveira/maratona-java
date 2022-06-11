package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Aula186Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Aula186Carro;

import java.util.List;

public class Aula188MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Aula186Barco> barcoList = criarArrayComUmObjeto(new Aula186Barco("Perola Negra"));
        System.out.println(barcoList);
        List<Aula186Carro> carroList = criarArrayComUmObjeto(new Aula186Carro("Jeep"));
        System.out.println(carroList);
    }

    private static <T> List<T> criarArrayComUmObjeto(T t) {
        return List.of(t);
    }
//    private static <T extends Comparable<T>> List<T> criarArrayComUmObjeto(T t) {
//        return List.of(t);
//    }
}



