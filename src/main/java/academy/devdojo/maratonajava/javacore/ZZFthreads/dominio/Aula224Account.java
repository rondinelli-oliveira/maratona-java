package academy.devdojo.maratonajava.javacore.ZZFthreads.dominio;

public class Aula224Account {

    private int balance = 50;

    public void withdrawal(int amount) {
        this.balance = this.balance - amount;
    }

    public int getBalance() {
        return balance;
    }
}
