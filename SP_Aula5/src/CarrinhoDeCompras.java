public class CarrinhoDeCompras {
    private double valorTotal;

    public CarrinhoDeCompras() {
        valorTotal = 0.0;
    }

    public void adicionarAoCarrinho(Produto produto) {
        valorTotal += produto.getValor();
    }

    public double getTotal() {
        return valorTotal;
    }
}

