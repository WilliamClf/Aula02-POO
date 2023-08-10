public class Boleto {
    private double valorBoleto;
    private double valorPago;
    private boolean vencido;

    Boleto() {
        this.valorBoleto = 0;
        this.valorPago = 0;
        this.vencido = false;
    }

    double getValorBoleto() {
        return this.valorBoleto;
    }

    void setValorBoleto(double valorBoleto) {
        this.valorBoleto = valorBoleto;
    }

    boolean getVencido() {
        return this.vencido;
    }

    void setVencido(boolean vencido) {
        if (vencido == false) {
            this.vencido = false;
        } else {
            this.vencido = true;
        }
    }

    double getValorPago() {
        return this.valorPago;
    }

    void setValorPago(double valorPago) {
        if (valorPago < 0) {
            this.valorPago = 0;
        } else {
            this.valorPago = valorPago;
        }
    }

    double pagar() {
        return getValorBoleto() - getValorPago();
    }

    void printStatusBoleto(double valor) {
        if (valor <= 0) {
            System.out.println("*Boleto Pago!");
        } else {
            System.out.printf("*Boleto Pago parcialmente, faltam %.2f R$\n", valor);
        }
    }

    void imprimirBoleto() {
        System.out.println("****************");
        System.out.println("*Valor do boleto: " + getValorBoleto());
        System.out.println("*Valor Pago: " + getValorPago());

        if (vencido == true) {
            System.out.println("*Vencimento: Vencido!");
        } else {
            System.out.println("*Vencimento: Ainda não!");
        }

        double valor = this.pagar();
        this.printStatusBoleto(valor);
        System.out.println("****************");
    }

}
