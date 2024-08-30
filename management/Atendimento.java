package management;

public class Atendimento {
    public final int id;
    public String nome;
    public String motivo;

    public Atendimento(int id, String nome, String motivo) {
        this.id = id;
        this.nome = nome;
        this.motivo = motivo;
    }

    @Override
    public String toString() {
        return "\"" + this.id + "-" + this.nome + "-" + this.motivo + "\"";
    }
}
