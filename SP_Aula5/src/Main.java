public class Main {
    public static void main(String[] args) {

        //EX2
        Veiculo carro = new Veiculo("Toyota", "Corolla", 2022);
        Veiculo moto = new Veiculo("Honda", "CBR 600", 2021);

        carro.ligar();
        moto.ligar();
        carro.desligar();

        System.out.println("Informações do Carro:");
        carro.Info();

        System.out.println("\nInformações da Moto:");
        moto.Info();

        //EX3
        ContaCorrente contaCorrente = new ContaCorrente("12345-1", 1000.0, 10.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca("54321-2", 500.0, 0.05);
        ContaSalario contaSalario = new ContaSalario("98765-3", 200.0);

        System.out.println("Saldo inicial da Conta Corrente: " + contaCorrente.consultarSaldo());
        contaCorrente.depositar(200.0);
        System.out.println("Depósito de 200.0 na Conta Corrente: " + contaCorrente.consultarSaldo());
        contaCorrente.sacar(50.0);
        System.out.println("Saque de 50.0 na Conta Corrente: " + contaCorrente.consultarSaldo());
        contaCorrente.aplicarTaxa();
        System.out.println("Aplicação de taxa na Conta Corrente: " + contaCorrente.consultarSaldo());

        System.out.println("Saldo inicial da Conta Poupança: " + contaPoupanca.consultarSaldo());
        contaPoupanca.depositar(100.0);
        System.out.println("Depósito de 100.0 na Conta Poupança: " + contaPoupanca.consultarSaldo());
        contaPoupanca.calcularJuros();
        System.out.println("Cálculo de juros na Conta Poupança: " + contaPoupanca.consultarSaldo());

        System.out.println("Saldo inicial da Conta Salário: " + contaSalario.consultarSaldo());
        contaSalario.depositar(50.0);
        System.out.println("Depósito de 50.0 na Conta Salário: " + contaSalario.consultarSaldo());

        //EX1
        Produto produto1 = new Produto("Camiseta", 29.99, "Camiseta de algodão.");
        Produto produto2 = new Produto("Tênis", 99.99, "Tênis esportivo.");
        Produto produto3 = new Produto("Boné", 9.99, "Boné de baseball.");

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarAoCarrinho(produto1);
        carrinho.adicionarAoCarrinho(produto2);
        carrinho.adicionarAoCarrinho(produto3);

        double total = carrinho.getTotal();

        // Exibir o valor total
        System.out.println("Valor Total: R$" + total);
    }

}







