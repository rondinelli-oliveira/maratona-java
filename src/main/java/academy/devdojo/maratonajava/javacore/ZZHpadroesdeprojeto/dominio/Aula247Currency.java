package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

public interface Aula247Currency {
    String getSymbol();
}

class Real implements Aula247Currency {
    @Override
    public String getSymbol() {
        return "R$";
    }
}

class UsDollar implements Aula247Currency {
    @Override
    public String getSymbol() {
        return "$";
    }
}
