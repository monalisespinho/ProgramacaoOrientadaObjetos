import java.util.ArrayList;

public class Multiplicacao implements Operador {
    @Override
    public double calcular(ArrayList<Double> lista) {
        double result = 1;
        for (double elemento : lista) {
            result *= elemento;
        }

        return result;
    }
}
