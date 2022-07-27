package academy.devdojo.maratonajava.javacore.Zgenerics.sevico;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Aula186Barco;

import java.util.ArrayList;
import java.util.List;

public class Aula186BarcoRentevelService {
    private List<Aula186Barco> barcosDisponiveis = new ArrayList<>(List.of(new Aula186Barco("Veleiro"), new Aula186Barco("Perola Negra")));

    public Aula186Barco buscarBarcoDispinivel() {
        System.out.println("Buscando barco disponivel....");
        Aula186Barco barco = barcosDisponiveis.remove(0);
        System.out.println("Alugando barco: " + barco);
        System.out.println("Barcos disponíveis para alugar:");
        System.out.println(barcosDisponiveis);
        return barco;
    }

    public void retornarBarcoAlugado(Aula186Barco barco) {
        System.out.println("Devolvendo barco " + barco);
        barcosDisponiveis.add(barco);
        System.out.println("Barcos disponíveis para alugar: ");
        System.out.println(barcosDisponiveis);
    }
}
