public class ContaCorrente extends ContaBancaria {

    @Override
    void pagarJuros() {
        // conta corrente não paga juros.
    }

    @Override
    void cobrarTaxa() {
        double novoSaldo = getSaldo() - 0.4;
        setSaldo(novoSaldo);
    }

}
