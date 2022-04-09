package academy.devdojo.maratonajava.introducao;

public class Aula21EstruturasCondicionais {
    public static void main(String[] args) {
        //idade < 15 categoria infantil
        //idade >= 15 && idade < 18 categoria juvenil
        //idade < 15 >=18 categoria adulto
        int idade = 18;

        String categoria;

        if (idade < 15) {
            System.out.println("Categoria Infantil.");
        } else if (idade >= 15 && idade < 18) {
            System.out.println("Catagoria Juvenil.");
        } else {
            System.out.println("Categoria Adulto.");
        }

        if (idade < 15) {
            categoria = "Categoria Infantil.";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Catagoria Juvenil.";
        } else {
            categoria = "Categoria Adulto.";
        }
        System.out.println(categoria);
    }

}
