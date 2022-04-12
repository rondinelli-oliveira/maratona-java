package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Aula39Estudante;

public class Aula39EstudanteTest01 {
    public static void main(String[] args) {
        Aula39Estudante estudante = new Aula39Estudante();

        estudante.nome = "Seya";
        estudante.idade= 18;
        estudante.sexo='M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante);
    }
}
