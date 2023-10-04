public class ContaPoupança extends ContaBancaria {
    @Override
    void pagarJuros() {
        double novoSaldo = getSaldo() + (getSaldo() * 0.0002);
        setSaldo(novoSaldo);
    }

    @Override
    void cobrarTaxa() {
        // conta poupança não cobra taxa.
    }

}
