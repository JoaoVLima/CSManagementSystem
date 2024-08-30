package management;

import java.util.Date;

public class Solicitacao {
    public final int id;
    public String descricao;
    public Date data_hora;

    public Solicitacao(int id, String descricao, Date data_hora) {
        this.id = id;
        this.descricao = descricao;
        this.data_hora = data_hora;
    }

    @Override
    public String toString() {
        return "\"" + this.id + "-" + this.descricao + "-" + this.data_hora + "\"";
    }
}

