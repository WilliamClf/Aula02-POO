public class Carro {
    double velocidade;
    boolean ligado;

    Carro() {// construtor
        velocidade = 0;
        ligado = false;
    }
   // public é comportamento padrão
    public void acelerar() {
        if (ligado == true) {
            velocidade = velocidade + 20;
        }
    }

    public void imprimirVelocidade() {
        System.out.println("VELOCIDADE: " + velocidade + " Km/h");
        if (velocidade >= 110.0) {
            System.out.println("Está no limite");
        }
    }

    public void ligar() {
        if (ligado == false) {
            ligado = true;
        }
    }
}
