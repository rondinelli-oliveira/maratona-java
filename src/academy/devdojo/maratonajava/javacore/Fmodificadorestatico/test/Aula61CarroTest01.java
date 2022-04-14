package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Aula61Carro;

public class Aula61CarroTest01 {
    public static void main(String[] args) {
        Aula61Carro carro1 = new Aula61Carro("BMW", 280);
        Aula61Carro carro2 = new Aula61Carro("Mercedes", 275);
        Aula61Carro carro3 = new Aula61Carro("Audi", 290);
        carro1.setVelocidadeLimite(180);

        carro1.imprimeDados();
        carro2.imprimeDados();
        carro3.imprimeDados();
    }

}
