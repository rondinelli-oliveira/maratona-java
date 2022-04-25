package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Aula84Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Aula84Gerente;

public class Aula84FuncionarioTest01 {
    public static void main(String[] args) {
        Aula84Gerente gerente = new Aula84Gerente("Flávia", 5000);
        Aula84Desenvolvedor desenvolvedor = new Aula84Desenvolvedor("Rondinelli", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
