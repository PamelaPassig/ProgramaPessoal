import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HubGamesPessoais {
    public static void main(String[] args) {
        System.out.println("=== Hub de Games Pessoais ===");


        Plataforma pc = new Plataforma(1, "PC");
        Plataforma ps5 = new Plataforma(2, "PlayStation 5");


        Genero rpg = new Genero(1, "RPG");
        Genero acao = new Genero(2, "Ação");


        List<Jogo> biblioteca = new ArrayList<>();


        Jogo jogo1 = new Jogo(1, "The Witcher 3", pc, rpg, "Zerado", new Date(), 10, "Excelente história e jogabilidade.");
        Jogo jogo2 = new Jogo(2, "Spider-Man 2", ps5, acao, "Jogando", new Date(), 9, "Gráficos incríveis e combate fluido.");


        biblioteca.add(jogo1);
        biblioteca.add(jogo2);


        System.out.println("\nJogos cadastrados na biblioteca:");
        for (Jogo jogo : biblioteca) {
            System.out.println("- " + jogo.getResumo());
        }

        System.out.println("\nTotal de jogos: " + biblioteca.size());
    }
}