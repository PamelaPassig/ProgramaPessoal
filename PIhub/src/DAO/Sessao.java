package DAO;

public class Sessao {
    public static int idUsuario;
    public static String usuarioLogado;
    public static String nomeUsuario;
    public static String genero;
    public static int idade;
    

    public static void limpar() {
        idUsuario = 0;
        usuarioLogado = null;
        nomeUsuario = null;
        genero = null;
        idade = 0;
    }}
