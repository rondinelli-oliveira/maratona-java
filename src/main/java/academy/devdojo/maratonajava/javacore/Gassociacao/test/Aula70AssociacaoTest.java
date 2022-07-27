package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aula70Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aula70Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aula70Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aula70Seminario;

public class Aula70AssociacaoTest {
    public static void main(String[] args) {
        Aula70Local local = new Aula70Local("Rua XXXX");
        Aula70Aluno aluno = new Aula70Aluno("Jose", 18);
        Aula70Professor professor = new Aula70Professor("Prof Pardal", "Matemática");
        Aula70Aluno[] alunosSeminario = {aluno};

        Aula70Seminario seminario = new Aula70Seminario("teste", alunosSeminario, local);

        Aula70Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprimeDados();
    }
}
