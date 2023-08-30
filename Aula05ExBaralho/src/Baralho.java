import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho extends Jogador {
    private List<Carta> cartas = new ArrayList<>();//

    public List<Carta> getCartas() {
        return this.cartas;
    }

    public void addCarta(String naipe, String valor, int peso) {
        Carta c;
        c = new Carta(naipe, valor, peso);
        this.cartas.add(c);
    }

    public Carta pescarCarta() {
        int ultimaCarta = this.cartas.size() - 1;
        Carta c = this.cartas.get(ultimaCarta);
        this.cartas.remove(ultimaCarta);
        return c;
    }

    void embaralhar() {
        Collections.shuffle(this.cartas);
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

    public boolean isEmpty() {
        return this.cartas.isEmpty();
    }
}
