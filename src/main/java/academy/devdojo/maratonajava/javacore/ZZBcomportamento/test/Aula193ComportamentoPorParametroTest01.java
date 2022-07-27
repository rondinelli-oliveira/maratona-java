package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Aula193Carro;

import java.util.ArrayList;
import java.util.List;

public class Aula193ComportamentoPorParametroTest01 {
    private static List<Aula193Carro> carros = List.of(new Aula193Carro("Verde", 2011), new Aula193Carro("Preto", 1998), new Aula193Carro("Vermelho", 2019));

    public static void main(String[] args) {
        System.out.println(filtroCarrosVerdes(carros));
        System.out.println(filtroCarrosVermelhos(carros));
        System.out.println(filtrarCarroPorCor(carros,"Verde"));
        System.out.println(filtrarCarroPorCor(carros, "Vermelho"));
        System.out.println("---------------------------------");
        System.out.println(filtrarCarroPorAnoAntesDe(carros, 2015));
    }

    private static List<Aula193Carro> filtroCarrosVerdes(List<Aula193Carro> carros) {
        List<Aula193Carro> carrosVerdes = new ArrayList<>();
        for (Aula193Carro carro : carros) {
            if (carro.getCor().equals("Verde")) {
                carrosVerdes.add(carro);
            }
        }
        return carrosVerdes;
    }

    private static List<Aula193Carro> filtroCarrosVermelhos(List<Aula193Carro> carros) {
        List<Aula193Carro> carrosVermelhos = new ArrayList<>();
        for (Aula193Carro carro : carros) {
            if (carro.getCor().equals("Vermelho")) {
                carrosVermelhos.add(carro);
            }
        }
        return carrosVermelhos;
    }

    private static List<Aula193Carro> filtrarCarroPorCor(List<Aula193Carro> carros, String cor) {
        List<Aula193Carro> FiltroCarros = new ArrayList<>();
        for (Aula193Carro carro : carros) {
            if (carro.getCor().equals(cor)) {
                FiltroCarros.add(carro);
            }
        }
        return FiltroCarros;
    }

    private static List<Aula193Carro> filtrarCarroPorAnoAntesDe(List<Aula193Carro> carros, int ano) {
        List<Aula193Carro> FiltroCarros = new ArrayList<>();
        for (Aula193Carro carro : carros) {
            if (carro.getAno() < ano) {
                FiltroCarros.add(carro);
            }
        }
        return FiltroCarros;
    }
}
