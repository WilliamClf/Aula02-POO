public class ContaSalario extends ContaBancaria {

    @Override
    void pagarJuros() {
        // salario não paga juros.
    }

    @Override
    void cobrarTaxa() {
        // salario não cobra taxa.
    }

}
