package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Aula41Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Aula41Professor professor = new Aula41Professor();
        professor.nome = "Doco";
        professor.idade = 99999999;
        professor.sexo = 'M';
        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo);
    }
}
