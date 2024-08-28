package structures;

public class Pilha {
    private final int tamanho;
    private int topo;
    private No fim;

    public Pilha(int tamanho) {
        this.tamanho = tamanho;
        this.topo = -1;
        this.fim = null;
    }

    boolean is_cheio() {
        return (this.topo == this.tamanho - 1);
    }

    boolean is_vazio() {
        return (this.topo == -1);
    }

    public void insere(int dado) throws Exception {
        if (this.is_cheio()) {
            throw new Exception("Pilha Cheia");
        }

        No novo_no = new No(dado);

        if (this.is_vazio()){
            this.fim = novo_no;
            this.topo++;
            return;
        }

        this.topo++;

        this.fim.proximo = novo_no;
        novo_no.anterior = this.fim;
        this.fim = this.fim.proximo;
    }

    public int remove() throws Exception {
        if (this.is_vazio()) {
            throw new Exception("Pilha Vazia");
        }
        int valor_removido = this.fim.dado;
        topo--;
        No no = this.fim.anterior;
        this.fim.proximo = null;
        this.fim = no;
        return valor_removido;
    }

    public void imprime() {
        System.out.print("[");

        if (this.is_vazio()){
            System.out.println("]");
            return;
        }

        No no = this.fim;
        while(no != null){
            System.out.print(no.dado);
            no = no.anterior;
            if(no != null){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

}
