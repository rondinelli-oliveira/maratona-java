package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Aula186Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.sevico.Aula186BarcoRentevelService;

public class Aula186ClasseGenericaTest02 {
    public static void main(String[] args) {
        Aula186BarcoRentevelService aula186BarcoRentevelService = new Aula186BarcoRentevelService();
        Aula186Barco barco = aula186BarcoRentevelService.buscarBarcoDispinivel();
        System.out.println("Usando o barco por um mês...");
        aula186BarcoRentevelService.retornarBarcoAlugado(barco);
    }
}
