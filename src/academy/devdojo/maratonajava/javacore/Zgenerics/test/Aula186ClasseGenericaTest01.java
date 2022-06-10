package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Aula186Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.sevico.Aula186CarroRentevelService;

public class Aula186ClasseGenericaTest01 {
    public static void main(String[] args) {
        Aula186CarroRentevelService aula186CarroRentevelService = new Aula186CarroRentevelService();
        Aula186Carro carro = aula186CarroRentevelService.buscarCarroDispinivel();
        System.out.println("Usando o carro por um mês...");
        aula186CarroRentevelService.retornarCarroAlugado(carro);
    }
}
