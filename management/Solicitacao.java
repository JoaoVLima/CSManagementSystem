package management;

import java.util.Date;
import java.util.UUID;

public class Solicitacao {
    public final UUID id;
    public String descricao;
    public Date data_hora;

    public Solicitacao(UUID id, String descricao, Date data_hora) {
        this.id = id;
        this.descricao = descricao;
        this.data_hora = data_hora;
    }

    @Override
    public String toString() {
        return "\"" + this.descricao + "-" + this.data_hora + "\"";
    }
}

