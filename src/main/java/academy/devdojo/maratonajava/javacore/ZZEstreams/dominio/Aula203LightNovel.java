package academy.devdojo.maratonajava.javacore.ZZEstreams.dominio;

import java.util.Objects;

public class Aula203LightNovel {
    private String title;
    private double price;
    private Aula214Category category;

    public Aula203LightNovel(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public Aula203LightNovel(String title, double price, Aula214Category category) {
        this.title = title;
        this.price = price;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public Aula214Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Aula203LightNovel{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aula203LightNovel that = (Aula203LightNovel) o;
        return Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}
