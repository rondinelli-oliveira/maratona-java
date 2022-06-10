package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Aula186Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Aula186Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.sevico.Aula187RentalService;

import java.util.ArrayList;
import java.util.List;

public class Aula187ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Aula186Carro> carrosDisponiveis = new ArrayList<>(List.of(new Aula186Carro("Mustang"), new Aula186Carro("Jeep")));
        List<Aula186Barco> barcosDisponiveis = new ArrayList<>(List.of(new Aula186Barco("Veleiro"), new Aula186Barco("Perola Negra")));
        Aula187RentalService<Aula186Carro> rentalServiceCarro = new Aula187RentalService<>(carrosDisponiveis);
        Aula186Carro carro = rentalServiceCarro.buscarObjetoDispinivel();
        System.out.println("Usando Carro pou um mes.....");
        rentalServiceCarro.retornarObjetoAlugado(carro);

        System.out.println("-----------------------------");

        Aula187RentalService<Aula186Barco> rentalServiceBarco = new Aula187RentalService<>(barcosDisponiveis);
        Aula186Barco barco = rentalServiceBarco.buscarObjetoDispinivel();
        System.out.println("Usando Barco por um mes....");
        rentalServiceBarco.retornarObjetoAlugado(barco);
    }
}
