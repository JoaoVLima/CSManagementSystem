package management;

import java.util.UUID;

public class Atendimento {
    public final UUID id;
    public String nome;
    public String motivo;

    public Atendimento(UUID id, String nome, String motivo) {
        this.id = id;
        this.nome = nome;
        this.motivo = motivo;
    }

    @Override
    public String toString() {
        return "\"" + this.nome + "-" + this.motivo + "\"";
    }
}
