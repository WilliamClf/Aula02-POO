public abstract class ContaBancaria {
    private double saldo = 0.0;

    abstract void pagarJuros();// obriga que nas filhas voce implemente

    void cobrarTaxa() {
        // Regra Implementada na classe filha
    }

    double getSaldo() {
        return this.saldo;
    }

    void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
