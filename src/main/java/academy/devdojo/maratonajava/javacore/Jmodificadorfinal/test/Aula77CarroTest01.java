package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.test;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Aula77Carro;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Aula79Ferrari;

public class Aula77CarroTest01 {
    public static void main(String[] args) {
        Aula77Carro carro = new Aula77Carro();
        System.out.println(Aula77Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Rondinelli Oliveira");
        System.out.println(carro.COMPRADOR);
        Aula79Ferrari ferrari = new Aula79Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprimeDados();
    }
}
