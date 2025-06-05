

import java.util.Date;

public class Jogo {
    private int id;
    private String nome;
    private Plataforma plataforma;
    private Genero genero;
    private String status;
    private Date dataCompra;
    private int nota;
    private String review;

    public Jogo(int id, String nome, Plataforma plataforma, Genero genero, String status,
                Date dataCompra, int nota, String review) {
        this.id = id;
        this.nome = nome;
        this.plataforma = plataforma;
        this.genero = genero;
        this.status = status;
        this.dataCompra = dataCompra;
        this.nota = nota;
        this.review = review;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Plataforma getPlataforma() {
        return plataforma;
    }

    public Genero getGenero() {
        return genero;
    }

    public String getStatus() {
        return status;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public int getNota() {
        return nota;
    }

    public String getReview() {
        return review;
    }

    public String getResumo() {
        return nome + " - " + status + " - Nota: " + nota;
    }
}