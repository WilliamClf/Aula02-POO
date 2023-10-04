import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private String nome;
    private int vitorias;
    private List<Carta> cartas;

    public Jogador(String nome) {
        this.nome = nome;
        this.vitorias = 0;
        this.cartas = new ArrayList<>();
    }

    void addCarta(Carta carta) {
        this.cartas.add(carta);
    }

    void limparCartas() {
        this.cartas.clear();

    }

    void addVitorias() {
        this.vitorias += 1;
    }

    int getSomaMao() {
        int somatorio = 0;
        for (Carta c : cartas) {
            somatorio += c.getPeso();
        }
        if (somatorio <= 21) {
            return somatorio;
        } else {
            return 0;
        }
    }

    String getNome() {
        return this.nome;
    }

    int getVitorias() {
        return this.vitorias;
    }

    void setNome(String nome) {
         this.nome = nome;
    }

    void setPontos(int vitorias) {
        this.vitorias = vitorias;
    }
}
