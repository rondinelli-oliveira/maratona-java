package academy.devdojo.maratonajava.javacore.ZZEatreams.dominio;

public class Aula203LightNovel {
    private String title;
    private double price;

    public Aula203LightNovel(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Aula203LightNovel{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
