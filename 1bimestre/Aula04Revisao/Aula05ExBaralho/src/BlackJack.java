import java.util.Scanner;

public class BlackJack {

    private BaralhoBlackJack baralho;
    private Jogador banca;
    private Jogador jogador1;

    void start() {
        baralho = new BaralhoBlackJack();
        banca = new Jogador("Banca");
        jogador1 = new Jogador("William");

        for (int i = 1; i <= 4; i++) {
            // jogo
            baralho.limparCartas();
            baralho.addCarta();
            baralho.embaralhar();

        }
    }

    void imprimirPlacar() {
        System.out.println("************PLACAR*************");
        System.out.println(banca.getNome() + ": " + banca.getVitorias());
        System.out.println(jogador1.getNome() + ": " + jogador1.getVitorias());
        System.out.println("*******************************");

    }
}
