

import java.util.Date;

public class ListaDesejo {
    private int id;
    private String nomeJogo;
    private Plataforma plataforma;
    private Date dataLancamentoPrevista;

    public ListaDesejo(int id, String nomeJogo, Plataforma plataforma, Date dataLancamentoPrevista) {
        this.id = id;
        this.nomeJogo = nomeJogo;
        this.plataforma = plataforma;
        this.dataLancamentoPrevista = dataLancamentoPrevista;
    }

    public int getId() {
        return id;
    }

    public String getNomeJogo() {
        return nomeJogo;
    }

    public Plataforma getPlataforma() {
        return plataforma;
    }

    public Date getDataLancamentoPrevista() {
        return dataLancamentoPrevista;
    }
}
