import java.util.ArrayList;

abstract class Calculadora {

    private double resultado;
    abstract void calcular(Operador operador, ArrayList<Double> lista);

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double getResultado() {
        return resultado;
    }

}
