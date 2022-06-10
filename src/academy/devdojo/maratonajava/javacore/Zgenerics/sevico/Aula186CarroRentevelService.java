package academy.devdojo.maratonajava.javacore.Zgenerics.sevico;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Aula186Carro;

import java.util.ArrayList;
import java.util.List;

public class Aula186CarroRentevelService {
    private List<Aula186Carro> carrosDisponiveis = new ArrayList<>(List.of(new Aula186Carro("Mustang"), new Aula186Carro("Jeep")));

    public Aula186Carro buscarCarroDispinivel() {
        System.out.println("Buscando carro disponivel....");
        Aula186Carro carro = carrosDisponiveis.remove(0);
        System.out.println("Alugando carro: " + carro);
        System.out.println("Carros disponíveis para alugar:");
        System.out.println(carrosDisponiveis);
        return carro;
    }

    public void retornarCarroAlugado(Aula186Carro carro) {
        System.out.println("Devolvendo carro " + carro);
        carrosDisponiveis.add(carro);
        System.out.println("Carros disponíveis para alugar: ");
        System.out.println(carrosDisponiveis);
    }
}
