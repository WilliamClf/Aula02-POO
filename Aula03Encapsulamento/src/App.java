import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor do boleto: ");
        double valorBoleto = sc.nextDouble();

        while (valorBoleto <= 0) {
            System.out.println("Valor Inválido, Informe o Valor do Boleto: ");
            valorBoleto = sc.nextDouble();
        }

        System.out.println("Insira o valor do pagamento: ");
        double valorPago = sc.nextDouble();

        while (valorPago <= 0) {
            System.out.println("Valor Inválido, Informe o Valor do Pagamento: ");
            valorPago = sc.nextDouble();
        }

        Boleto boletoDoWill = new Boleto();
        boletoDoWill.setValorBoleto(valorBoleto);
        boletoDoWill.setValorPago(valorPago);
        boletoDoWill.setVencido(false);
        boletoDoWill.imprimirBoleto();

    }
}
