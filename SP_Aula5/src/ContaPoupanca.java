class ContaPoupanca extends Conta {
    private double taxaDeJuros;

    public ContaPoupanca(String numeroConta, double saldoInicial, double taxaDeJuros) {
        super(numeroConta, saldoInicial);
        this.taxaDeJuros = taxaDeJuros;
    }

    public void calcularJuros() {
        depositar(getSaldo() * taxaDeJuros);
    }

    @Override
    public void aplicarTaxa() {
    }
}