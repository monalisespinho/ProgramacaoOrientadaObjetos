abstract class Conta {
    private String numeroConta;
    private double saldo;

    public Conta(String numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void transferir(Conta destino, double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            destino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public abstract void aplicarTaxa();

    @Override
    public String toString() {
        return "Conta{" +
                "numeroConta='" + numeroConta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}

