class ContaCorrente extends Conta {
    private double taxaDeManutencao;

    public ContaCorrente(String numeroConta, double saldoInicial, double taxaDeManutencao) {
        super(numeroConta, saldoInicial);
        this.taxaDeManutencao = taxaDeManutencao;
    }

    @Override
    public void aplicarTaxa() {
        sacar(taxaDeManutencao);
    }
}
