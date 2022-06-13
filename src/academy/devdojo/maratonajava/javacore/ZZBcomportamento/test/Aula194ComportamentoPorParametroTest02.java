package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Aula193Carro;
import academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces.Aula194CarroPredicate;

import java.util.ArrayList;
import java.util.List;

public class Aula194ComportamentoPorParametroTest02 {
    private static List<Aula193Carro> carros = List.of(new Aula193Carro("Verde", 2011), new Aula193Carro("Preto", 1998), new Aula193Carro("Vermelho", 2019));

    public static void main(String[] args) {
//        List<Aula193Carro> carrosVerdes = filtrar(carros, new Aula194CarroInterface() {
//            @Override
//            public boolean test(Aula193Carro carro) {
//                return carro.getCor().equals("Verde");
//            }
//        });

        List<Aula193Carro> carrosVerdes = filtrar(carros, carro -> carro.getCor().equals("Verde"));
        List<Aula193Carro> carrosVermelhos = filtrar(carros, carro -> carro.getCor().equals("Vermelho"));
        List<Aula193Carro> carrosPorAnoAntesDe = filtrar(carros, carro -> carro.getAno() < 2015);
        System.out.println(carrosVerdes);
        System.out.println(carrosVermelhos);
        System.out.println(carrosPorAnoAntesDe);
    }

    private static List<Aula193Carro> filtrar(List<Aula193Carro> carros, Aula194CarroPredicate carroPredicate) {
        List<Aula193Carro> filtroCarros = new ArrayList<>();
        for (Aula193Carro carro : carros) {
            if (carroPredicate.test(carro)) {
                filtroCarros.add(carro);
            }
        }
        return filtroCarros;
    }
}
