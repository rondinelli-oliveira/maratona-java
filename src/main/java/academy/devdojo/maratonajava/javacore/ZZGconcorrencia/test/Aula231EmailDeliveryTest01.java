package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio.Aula231Members;
import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service.Aula231EmailDeliveryService;

import javax.swing.*;

public class Aula231EmailDeliveryTest01 {
    public static void main(String[] args) {
        Aula231Members members = new Aula231Members();
        Thread rondinelli = new Thread(new Aula231EmailDeliveryService(members), "Rondinelli");
        Thread flavia = new Thread(new Aula231EmailDeliveryService(members), "Flavia");
        rondinelli.start();
        flavia.start();
        while (true) {
            String email = JOptionPane.showInputDialog("Entre com seu email");
            if (email == null || email.isEmpty()) {
                members.close();
                break;
            }
            members.addMemberEmail(email);
        }
    }
}
