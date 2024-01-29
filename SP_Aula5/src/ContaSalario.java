class ContaSalario extends Conta {
    public ContaSalario(String numeroConta, double saldoInicial) {
        super(numeroConta, saldoInicial);
    }

    @Override
    public void aplicarTaxa() {
    }
}
