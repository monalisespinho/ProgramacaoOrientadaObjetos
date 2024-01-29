import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<Conta> contas;

    public Banco(){
        contas = new ArrayList<>();
    }
    public void adicionarConta(Conta conta){
        this.contas.add(conta);
    }

    public List<Conta> listarConta() {
        return contas;
    }

    public Conta buscarConta(int numeroConta){
        for (Conta conta : contas){
            if (conta.getNumeroConta() == numeroConta){
                return conta;
            }

        }
        return null;
    }


}
