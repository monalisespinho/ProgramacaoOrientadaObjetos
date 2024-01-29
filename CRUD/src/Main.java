import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList();
        adicionarItemLista(lista, "Monalise");
        adicionarItemLista(lista, "Bruno");
        adicionarItemLista(lista, "Tainara");
        adicionarItemLista(lista, "Liliane");
        adicionarItemLista(lista, "Manoela");

        removerItemLista(lista, 0);

        lerLista(lista);

        atualizarItemLista(lista,2,"Ana");
    }
    public static void adicionarItemLista(ArrayList<String> lista, String item){
        lista.add(item);
    }
    public static void removerItemLista(ArrayList<String> lista, int posicao){
        lista.remove(posicao);
    }

    public static void lerLista(ArrayList<String> lista ) {
        System.out.println(lista);
    }

    public static void atualizarItemLista(ArrayList<String> lista,  int posicao, String item){
        lista.set(posicao, item);
    }



}