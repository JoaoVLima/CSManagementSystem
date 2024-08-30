import structures.Fila;
import structures.Pilha;

public class Main {
    public static void main(String[] args) throws Exception {
        Fila pilha = new Fila(5);
        pilha.imprime();
        pilha.insere(1);
        pilha.imprime();
        pilha.remove();
        pilha.imprime();
        pilha.insere(2);
        pilha.imprime();
        pilha.insere(3);
        pilha.imprime();
        pilha.insere(4);
        pilha.imprime();
        pilha.insere(5);
        pilha.imprime();
        pilha.remove();
        pilha.remove();
        pilha.imprime();
        pilha.insere(6);
        pilha.imprime();

    }
}
