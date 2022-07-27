package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aula66Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aula66Professor;

public class Aula66EscolaTest01 {
    public static void main(String[] args) {
        Aula66Professor professor1 = new Aula66Professor("Professor de Matemática");
        Aula66Professor professor2 = new Aula66Professor("Professor de Portugues");
        Aula66Professor[] professores = {professor1, professor2};
        Aula66Escola escola = new Aula66Escola("Escola do Bairro aqui mesmo", professores);

        escola.imprimeDados();
    }
}
