import java.util.Collections;

public class BaralhoPortugues extends Baralho {
    void embaralhar() {
        getCartas().clear();
        // OUROS
        getCartas().add(new Carta("OUROS", "1", 1));
        getCartas().add(new Carta("OUROS", "2", 2));
        getCartas().add(new Carta("OUROS", "Q", 11));
        getCartas().add(new Carta("OUROS", "J", 12));
        getCartas().add(new Carta("OUROS", "K", 13));
        getCartas().add(new Carta("OUROS", "3", 3));
        getCartas().add(new Carta("OUROS", "4", 4));
        getCartas().add(new Carta("OUROS", "5", 5));
        getCartas().add(new Carta("OUROS", "6", 6));
        getCartas().add(new Carta("OUROS", "7", 7));
        getCartas().add(new Carta("OUROS", "8", 8));
        getCartas().add(new Carta("OUROS", "9", 9));
        getCartas().add(new Carta("OUROS", "10", 10));
        // ESPADA
        getCartas().add(new Carta("ESPADA", "1", 1));
        getCartas().add(new Carta("ESPADA", "2", 2));
        getCartas().add(new Carta("ESPADA", "Q", 11));
        getCartas().add(new Carta("ESPADA", "J", 12));
        getCartas().add(new Carta("ESPADA", "K", 13));
        getCartas().add(new Carta("ESPADA", "3", 3));
        getCartas().add(new Carta("ESPADA", "4", 4));
        getCartas().add(new Carta("ESPADA", "5", 5));
        getCartas().add(new Carta("ESPADA", "6", 6));
        getCartas().add(new Carta("ESPADA", "7", 7));
        getCartas().add(new Carta("ESPADA", "8", 8));
        getCartas().add(new Carta("ESPADA", "9", 9));
        getCartas().add(new Carta("ESPADA", "10", 10));
        // PAUS
        getCartas().add(new Carta("PAUS", "1", 1));
        getCartas().add(new Carta("PAUS", "2", 2));
        getCartas().add(new Carta("PAUS", "Q", 11));
        getCartas().add(new Carta("PAUS", "J", 12));
        getCartas().add(new Carta("PAUS", "K", 13));
        getCartas().add(new Carta("PAUS", "3", 3));
        getCartas().add(new Carta("PAUS", "4", 4));
        getCartas().add(new Carta("PAUS", "5", 5));
        getCartas().add(new Carta("PAUS", "6", 6));
        getCartas().add(new Carta("PAUS", "7", 7));
        getCartas().add(new Carta("PAUS", "8", 8));
        getCartas().add(new Carta("PAUS", "9", 9));
        getCartas().add(new Carta("PAUS", "10", 10));
        // COPAS
        getCartas().add(new Carta("COPAS", "1", 1));
        getCartas().add(new Carta("COPAS", "2", 2));
        getCartas().add(new Carta("COPAS", "Q", 11));
        getCartas().add(new Carta("COPAS", "J", 12));
        getCartas().add(new Carta("COPAS", "K", 13));
        getCartas().add(new Carta("COPAS", "3", 3));
        getCartas().add(new Carta("COPAS", "4", 4));
        getCartas().add(new Carta("COPAS", "5", 5));
        getCartas().add(new Carta("COPAS", "6", 6));
        getCartas().add(new Carta("COPAS", "7", 7));
        getCartas().add(new Carta("COPAS", "8", 8));
        getCartas().add(new Carta("COPAS", "9", 9));
        getCartas().add(new Carta("COPAS", "10", 10));

        Collections.shuffle(getCartas());

    }
}
