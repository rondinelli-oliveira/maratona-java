package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aula64Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aula65Time;

public class Aula65JogadorTest02 {
    public static void main(String[] args) {
        Aula64Jogador jogador1 = new Aula64Jogador("Gabigol");
        Aula65Time time = new Aula65Time("Flamengo");

        jogador1.setTime(time);
        
        jogador1.imprimeDados();
    }
}
