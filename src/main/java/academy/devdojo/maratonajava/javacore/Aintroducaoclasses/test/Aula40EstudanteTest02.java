package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Aula39Estudante;

public class Aula40EstudanteTest02 {
    public static void main(String[] args) {
        Aula39Estudante estudante = new Aula39Estudante();
        Aula39Estudante estudante2 = new Aula39Estudante();

        estudante.nome = "Seya";
        estudante.idade = 18;
        estudante.sexo = 'M';

        estudante2.nome = "Seya";
        estudante2.idade = 18;
        estudante2.sexo = 'M';


        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println("_______________");
        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
    }
}
