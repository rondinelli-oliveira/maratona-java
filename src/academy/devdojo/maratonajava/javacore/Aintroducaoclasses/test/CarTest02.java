package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Car;

public class CarTest02 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        car1.name = "Gol";
        car1.model = "G5";
        car1.year = 2011;

        car2.name = "Voyage";
        car2.model = "G6";
        car2.year = 2013;

        //Referencia de objetos
        car1 = car2;

        System.out.println("Carro 1");
        System.out.println(car1.name);
        System.out.println(car1.model);
        System.out.println(car1.year);

        System.out.println("---------------");

        System.out.println("Carro 2");
        System.out.println(car2.name);
        System.out.println(car2.model);
        System.out.println(car2.year);
    }
}
