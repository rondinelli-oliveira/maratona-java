package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Aula71Funcionario;

public class Aula75HerancaTest02 {
    // 0 - Bloco de inicialização estático da super classe é executado quando a JVM carregar a classe pai
    // 1 - Bloco de inicialização estático da subclasse é executado quando a JVM carregar a classe filha
    // 2 - Alocado espaco em memória pro objeto da superclasse
    // 3 - Cada atributo da superclasse é criado e inicializado com valores default ou o quer for passado
    // 4 - Bloco de inicialização da superclasse é executado na prdem em que aparece
    // 5 - Construtor da superclasse é executado
    // 6 - Alocado espaco em memória pro objeto da subclasse
    // 7 - Cada atributo da subclasse é criado e inicializado com valores default ou o quer for passado
    // 8 - Bloco de inicialização da subclasse é executado na prdem em que aparece
    // 9 - Construtor da subclasse é executado
    public static void main(String[] args) {
        Aula71Funcionario funcionario = new Aula71Funcionario("Rondinelli Oliveira");
    }
}
