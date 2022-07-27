package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

import academy.devdojo.maratonajava.javacore.ZZFthreads.dominio.Aula224Account;

public class Aula224ThreadAccountTest01 implements Runnable {
    private final Aula224Account aula224Account = new Aula224Account();

    public static void main(String[] args) {
        Aula224ThreadAccountTest01 threadAccountTest01 = new Aula224ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01, "Hestia");
        Thread t2 = new Thread(threadAccountTest01, "Bell Cranel");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
            if (aula224Account.getBalance() < 0) {
                System.out.println("FODEO");
            }
        }
    }

    private void withdrawal(int amount) {
        System.out.println(getThreadName() + " #### fora do synchronized");
        synchronized (aula224Account) {
            System.out.println(getThreadName() + " **** dentro do synchronized");
            if (aula224Account.getBalance() >= amount) {
                System.out.println(getThreadName() + " está indo sacar dinheiro");
                aula224Account.withdrawal(amount);
                System.out.println(getThreadName() + " completou o saque, valor atual da conta " + aula224Account.getBalance());
            } else {
                System.out.println("Sem dinheiro para " + getThreadName() + " efetuar o saque " + aula224Account.getBalance());
            }
        }
    }

    private String getThreadName() {
        return Thread.currentThread().getName();
    }
}
