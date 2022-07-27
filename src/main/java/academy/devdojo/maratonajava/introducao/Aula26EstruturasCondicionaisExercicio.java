package academy.devdojo.maratonajava.introducao;

public class Aula26EstruturasCondicionaisExercicio {
    public static void main(String[] args) {

        //Utilizando Switch e dados os valores de 1 a 7, imprima se é dia util ou final de semana
        //considerando 1 como Domingo
        byte dia = 7;

        // char, int, byte, short, enum, String
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Util");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

}
