package structures;

public class Fila<T> {
    private final int tamanho;
    private No<T> inicio;
    private int quantidade;

    public Fila(int tamanho) {
        this.tamanho = tamanho;
        this.inicio = null;
        this.quantidade = 0;
    }

    boolean is_cheio() {
        return (this.quantidade == this.tamanho);
    }

    boolean is_vazio() {
        return (this.inicio == null);
    }

    public void insere(T dado) throws Exception {
        if (this.is_cheio()) {
            throw new Exception("Fila Cheia");
        }

        No<T> novo_no = new No<T>(dado);
        this.quantidade++;

        if (this.is_vazio()){
            this.inicio = novo_no;
            return;
        }

        No no = this.inicio;
        while(no.proximo != null){
            no = no.proximo;
        }

        no.proximo = novo_no;
    }

    public T remove() throws Exception {
        if (this.is_vazio()) {
            throw new Exception("Fila Vazia");
        }
        T valor_removido = (T) this.inicio.dado;
        this.quantidade--;
        this.inicio = this.inicio.proximo;
        if(this.inicio != null){
            this.inicio.anterior = null;
        }
        return valor_removido;
    }

    public void imprime() {
        System.out.print("[");

        if (this.is_vazio()){
            System.out.println("]");
            return;
        }

        No no = this.inicio;
        while(no != null){
            System.out.print(no.dado);
            no = no.proximo;
            if(no != null){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}
