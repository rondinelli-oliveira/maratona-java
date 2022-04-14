package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aula64Jogador;

public class Aula64JogadorTest01 {
    public static void main(String[] args) {
        Aula64Jogador jogador1 = new Aula64Jogador("Gabigol");
        Aula64Jogador jogador2 = new Aula64Jogador("Arrascaeta");
        Aula64Jogador jogador3 = new Aula64Jogador("Bruno ");
        Aula64Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Aula64Jogador jogador : jogadores) {
            jogador.imprimeDados();
        }
    }
}
