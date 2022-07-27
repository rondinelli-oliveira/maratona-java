package academy.devdojo.maratonajava.introducao;

public class Aula22EstruturasCondicionais {
    public static void main(String[] args) {
        //Doar se salario >= 5000

        double salario = 500;
        String mensagemDoar = "Eu vou doar 500 para o devdojo";
        String mensagemNaoDoar = "Ainda não tenho condições de doar, mas vou ter";
        String resultado;

        if (salario > 5000) {
            resultado = mensagemDoar;
        } else {
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);

        //sitaxe operador ternário
        //(cindição) ? verdadeiro : falso

        String resultado1 = salario >= 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado1);
    }
}
