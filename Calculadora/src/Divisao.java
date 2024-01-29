import java.util.ArrayList;

public class Divisao implements Operador {
    @Override
    public double calcular(ArrayList<Double> lista) {
        double result = lista.get(0);

        for (int i = 1; i < lista.size(); i++) {
            double elemento = lista.get(i);
            if (elemento == 0.0) {
                throw new ArithmeticException("Divisão por zero não é permitida");
            }
            result /= elemento;
        }

        return result;
    }
}