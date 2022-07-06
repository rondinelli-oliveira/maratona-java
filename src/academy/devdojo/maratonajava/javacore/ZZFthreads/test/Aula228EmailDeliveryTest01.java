package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

import academy.devdojo.maratonajava.javacore.ZZFthreads.dominio.Aula228Members;
import academy.devdojo.maratonajava.javacore.ZZFthreads.service.Aula228EmailDeliveryService;

import javax.swing.*;

public class Aula228EmailDeliveryTest01 {
    public static void main(String[] args) {
        Aula228Members members = new Aula228Members();
        Thread jiraya = new Thread(new Aula228EmailDeliveryService(members), "Rondinelli");
        Thread kakashi = new Thread(new Aula228EmailDeliveryService(members), "Flavia");
        jiraya.start();
        kakashi.start();
        while(true){
            String email = JOptionPane.showInputDialog("Entre com seu email");
            if(email == null || email.isEmpty()){
                members.close();
                break;
            }
            members.addMemberEmail(email);
        }
    }
}
