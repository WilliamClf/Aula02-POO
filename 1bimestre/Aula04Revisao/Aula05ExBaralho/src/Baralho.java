import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
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

    void limparCartas() {
        this.cartas.clear();
    }

    void embaralhar() {
        Collections.shuffle(this.cartas);
    }

    public boolean isEmpty() {
        return this.cartas.isEmpty();
    }
}
