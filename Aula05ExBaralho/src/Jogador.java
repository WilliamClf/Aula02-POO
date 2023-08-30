public class Jogador {
    private String nome;
    private int pontos;

    public Jogador(String nome) {
        this.nome = nome;
        this.pontos = 0;
    }

    String getNome() {
        return this.nome;
    }

    int getPontos() {
        return this.pontos;
    }

    void setNome(String nome) {
         this.nome = nome;
    }

    void setPontos(int pontos) {
        this.pontos = pontos;
    }
}
