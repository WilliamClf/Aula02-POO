public class Boleto {
    private double valorBoleto;
    private double valorPago;
    private boolean vencido;

    public Boleto() {
        this.valorBoleto = 0;
        this.valorPago = 0;
        this.vencido = false;
    }

    public double getValorBoleto() {
        return this.valorBoleto;
    }

    public void setValorBoleto(double valorBoleto) {
        this.valorBoleto = valorBoleto;
    }

    public boolean getVencido() {
        return this.vencido;
    }

    public void setVencido(boolean vencido) {
        if (vencido == false) {
            this.vencido = false;
        } else {
            this.vencido = true;
        }
    }

    public double getValorPago() {
        return this.valorPago;
    }

    public void setValorPago(double valorPago) {
        if (valorPago < 0) {
            this.valorPago = 0;
        } else {
            this.valorPago = valorPago;
        }
    }

    void pagar() {
        double valor = getValorBoleto() - getValorPago();
        if (valor == 0) {
            System.out.println("*Boleto Pago!");
        } else {
            System.out.printf("*Boleto Pago parcialmente, faltam %.2f R$\n", valor);
        }
    }

    void imprimirBoleto() {
        System.out.println("**********************");
        System.out.println("*Valor do boleto: " + getValorBoleto());
        System.out.println("*Valor Pago: " + getValorPago());

        if (vencido == true) {
            System.out.println("*Vencimento: Vencido!");
        } else {
            System.out.println("*Vencimento: Ainda não!");
        }

        pagar();// imprime o pagamento
        System.out.println("**********************");
    }

}
