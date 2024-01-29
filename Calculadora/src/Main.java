import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> listaSoma = new ArrayList<Double>();
        listaSoma.add(30.0);
        listaSoma.add(30.00);

        ArrayList<Double> listaSubtracao = new ArrayList<Double>();
        listaSubtracao.add(30.0);
        listaSubtracao.add(20.00);

        ArrayList<Double> listaMultiplicacao = new ArrayList<Double>();
        listaMultiplicacao.add(3.0);
        listaMultiplicacao.add(2.00);

        ArrayList<Double> listaDivisao = new ArrayList<Double>();
        listaDivisao.add(20.0);
        listaDivisao.add(2.0);

        Operador soma = new Soma();
        Operador subtracao = new Subtracao();
        Operador multiplicacao = new Multiplicacao();
        Operador divisao = new Divisao();


        Calculadora calculadora = new CalculadoraBasica();

        //Soma
        calculadora.calcular(soma, listaSoma);
        System.out.println(calculadora.getResultado());

        //Subtração
        calculadora.calcular(subtracao, listaSubtracao);
        System.out.println(calculadora.getResultado());

        //Multiplicacao
        calculadora.calcular(multiplicacao, listaMultiplicacao);
        System.out.println(calculadora.getResultado());

        //Divisão
        calculadora.calcular(divisao, listaDivisao);
        System.out.println(calculadora.getResultado());

    }
}