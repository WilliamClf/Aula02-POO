public class Carta {
    private String naipe;
    private String valor;
    private int peso;

    Carta(String naipe, String valor, int peso){
        this.naipe = naipe;
        this.valor = valor;
        this.peso = peso;
    }
    
    String getNaipe() {
        return this.naipe;
    }

    void setNaipe(String naipe) {
         this.naipe = naipe;
    }

    String getValor() {
        return this.valor;
    }

    void setValor(String valor) {
         this.valor = valor;
    }

    int getPeso() {
        return this.peso;
    }

    void setPeso(int peso) {
         this.peso = peso;
    }
}