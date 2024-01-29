public class Conta {
    private int numeroConta;
    private double saldoConta;
    private static  int contador = 1;

    public Conta (){
        saldoConta = 0;
        numeroConta = contador;
        contador++;

    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }
}
