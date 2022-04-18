package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aula64Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aula65Time;

public class Aula67JogadorTest03 {
    public static void main(String[] args) {
        Aula64Jogador jogador = new Aula64Jogador("Gabigol");
        Aula64Jogador jogador2 = new Aula64Jogador("Arrascaeta");
        Aula65Time time = new Aula65Time("Flamengo");
        Aula64Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador.imprimeDados();
//        jogador2.imprimeDados();
        System.out.println("--- Time ---");
        time.imprimeDados();
    }
}
