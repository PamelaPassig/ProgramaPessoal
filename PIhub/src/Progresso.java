
import java.util.Date;

public class Progresso {
    private int id;
    private Jogo jogo;
    private int percentual;
    private Date dataAtualizacao;

    public Progresso(int id, Jogo jogo, int percentual, Date dataAtualizacao) {
        this.id = id;
        this.jogo = jogo;
        this.percentual = percentual;
        this.dataAtualizacao = dataAtualizacao;
    }

    public int getId() {
        return id;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public int getPercentual() {
        return percentual;
    }

    public Date getDataAtualizacao() {
        return dataAtualizacao;
    }
}
