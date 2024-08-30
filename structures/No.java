package structures;

public class No<T> {
    protected T dado;
    protected No<T> anterior;
    protected No<T> proximo;

    public No(T dado){
        this.dado = dado;
    }
}
