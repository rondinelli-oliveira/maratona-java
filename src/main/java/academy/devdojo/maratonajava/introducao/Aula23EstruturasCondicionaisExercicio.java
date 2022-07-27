package academy.devdojo.maratonajava.introducao;

//Tabela do IR 2022
//Base de cálculo mensal	Alíquota	Valor a deduzir do IR
//De R$ 1.903,98 a R$ 2.826,65	7,5%	R$ 142,80
//De R$ 2.826,65 a R$ 3.751,06	15%	R$ 354,80
//De R$ 3.751,06 a R$ 4.664,68	22,5%	R$ 636,13
//Acima de R$ 4.664,68	27,5%	R$ 869,36
public class Aula23EstruturasCondicionaisExercicio {
    public static void main(String[] args) {
        double salario = 7200.00;
        double faixaImposto1 = 7.5 / 100;
        double faixaImposto2 = 15.0 / 100;
        double faixaImposto3 = 22.5 / 100;
        double faixaImposto4 = 27.5 / 100;

        if (salario < 1903.98) {
            System.out.println("nao devera pagar imposto");
        } else if (salario >= 1903.98 && salario < 2826.65) {
            System.out.println("O imposto é de : " + salario * faixaImposto1);
        } else if (salario >= 2826.65 && salario < 3751.06) {
            System.out.println("O imposto é de : " + salario * faixaImposto2);
        } else if (salario >= 3751.06 && salario < 4664.68) {
            System.out.println("O imposto é de : " + salario * faixaImposto3);
        } else {
            System.out.println("O imposto é de : " + salario * faixaImposto4);
        }
    }
}
