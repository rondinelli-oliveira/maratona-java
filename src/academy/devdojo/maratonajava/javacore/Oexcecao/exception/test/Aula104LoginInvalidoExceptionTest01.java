package academy.devdojo.maratonajava.javacore.Oexcecao.exception.test;

import academy.devdojo.maratonajava.javacore.Oexcecao.exception.dominio.Aula104LoginInvalidoException;

import java.util.Scanner;

public class Aula104LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (Aula104LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws Aula104LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "Rondinelli";
        String senhaDB = "123";
        System.out.println("Usuário: ");
        String usernameDigitado = teclado.nextLine();
        System.out.println("Senha: ");
        String senhaDigitada = teclado.nextLine();
        if (!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)) {
            throw new Aula104LoginInvalidoException("Usuário ou senha inválidos");
        }

        System.out.println("Usuário logado com sucesso....");
    }
}
