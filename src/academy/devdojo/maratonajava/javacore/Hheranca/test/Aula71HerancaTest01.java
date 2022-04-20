package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Aula71Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Aula71Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Aula71Pessoa;

public class Aula71HerancaTest01 {
    public static void main(String[] args) {
        Aula71Endereco endereco = new Aula71Endereco();
        endereco.setRua("Rua XXXXXXXXXXX");
        endereco.setCep("38400-000");

        Aula71Pessoa pessoa = new Aula71Pessoa();
        pessoa.setNome("Rondinelli Oliveira");
        pessoa.setCpf("111.222.333-44");
        pessoa.setEndereco(endereco);
        pessoa.imprimeDados();


        Aula71Funcionario funcionario = new Aula71Funcionario();
        funcionario.setNome("Flávia Cristina");
        funcionario.setCpf("222.333.444-55");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(120000);
        funcionario.imprimeDados();
    }
}
