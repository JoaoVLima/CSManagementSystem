package structures;

public class Fila {
    private final int tamanho;
    private No inicio;
    private No fim;
    private boolean vazia;

    public Fila(int tamanho) {
        this.tamanho = tamanho;
        this.inicio = null;
        this.fim = null;
        this.vazia = true;
    }

    boolean is_cheio() {
        return (this.inicio == this.fim && !this.vazia);
    }

    boolean is_vazio() {
        return this.vazia;
    }

    public void insere(int dado) throws Exception {
        if (this.is_cheio()) {
            throw new Exception("Fila Cheia");
        }

        No novo_no = new No(dado);

        if (this.is_vazio()){
            this.inicio = novo_no;
            this.fim = novo_no;
            this.vazia = false;
            return;
        }

        this.fim.proximo = novo_no;
        novo_no.anterior = this.fim;
        this.fim = this.fim.proximo;
    }

    public int remove() throws Exception {
        if (this.is_vazio()) {
            throw new Exception("Fila Vazia");
        }
        int valor_removido = this.inicio.dado;
        this.inicio = this.inicio.proximo;
        if(this.inicio == null){
            this.fim = null;
            this.vazia = true;
            return valor_removido;
        }
        this.inicio.anterior = null;
        this.vazia = this.inicio == this.fim;
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
