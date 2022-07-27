package academy.devdojo.maratonajava.javacore.Zgenerics.sevico;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Aula186Carro;

import java.util.List;

public class Aula187RentalService<T> {
    private List<T> objetosDisponiveis;

    public Aula187RentalService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T buscarObjetoDispinivel() {
        System.out.println("Buscando objeto disponivel....");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando objeto: " + t);
        System.out.println("Objetos disponíveis para alugar:");
        System.out.println(objetosDisponiveis);
        return t;
    }

    public void retornarObjetoAlugado(T t) {
        System.out.println("Devolvendo objeto " + t);
        objetosDisponiveis.add(t);
        System.out.println("Objetos disponíveis para alugar: ");
        System.out.println(objetosDisponiveis);
    }
}
