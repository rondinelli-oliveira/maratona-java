package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Aula193Carro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Aula194ComportamentoPorParametroTest03 {
    private static List<Aula193Carro> carros = List.of(new Aula193Carro("Verde", 2011), new Aula193Carro("Preto", 1998), new Aula193Carro("Vermelho", 2019));

    public static void main(String[] args) {
        List<Aula193Carro> carrosVerdes = filtrar(carros, carro -> carro.getCor().equals("Verde"));
        List<Aula193Carro> carrosVermelhos = filtrar(carros, carro -> carro.getCor().equals("Vermelho"));
        List<Aula193Carro> carrosPorAnoAntesDe = filtrar(carros, carro -> carro.getAno() < 2015);
        System.out.println(carrosVerdes);
        System.out.println(carrosVermelhos);
        System.out.println(carrosPorAnoAntesDe);
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(filtrar(numeros, numeroPar -> numeroPar % 2 == 0));
    }

    private static <T> List<T> filtrar(List<T> list, Predicate<T> predicate) {
        List filtroListas = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)) {
                filtroListas.add(e);
            }
        }
        return filtroListas;
    }
}
