package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Aula49Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Aula49ImpressoraEstudante;

public class Aula49EstudanteTest01 {
    public static void main(String[] args) {
        Aula49Estudante estudante1 = new Aula49Estudante();
        Aula49Estudante estudante2 = new Aula49Estudante();
        Aula49ImpressoraEstudante impressoraEstudante = new Aula49ImpressoraEstudante();

        estudante1.nome = "Seya";
        estudante1.idade = 25;
        estudante1.sexo = 'M';

        estudante2.nome = "Marim";
        estudante2.idade = 35;
        estudante2.sexo = 'F';

        impressoraEstudante.imprime(estudante1);
        impressoraEstudante.imprime(estudante2);

        System.out.println("###################");

        impressoraEstudante.imprime(estudante1);
        impressoraEstudante.imprime(estudante2);
    }
}
