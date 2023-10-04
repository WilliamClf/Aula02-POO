import javax.security.sasl.Sasl;

public class App {
    public static void main(String[] args) throws Exception {
        ContaBancaria[] contas = new ContaBancaria[10];
        contas[0] = new ContaCorrente();
        contas[0].setSaldo(1100.0);

        contas[1] = new ContaSalario();
        contas[1].setSaldo(500.0);

        contas[2] = new ContaPoupança();
        contas[2].setSaldo(12000.0);

        contas[3] = new ContaCorrente();
        contas[3].setSaldo(1100.0);

        contas[4] = new ContaSalario();
        contas[4].setSaldo(1200.0);

        contas[5] = new ContaPoupança();
        contas[5].setSaldo(13210.0);

        contas[6] = new ContaCorrente();
        contas[6].setSaldo(1566.0);

        contas[7] = new ContaSalario();
        contas[7].setSaldo(3450.0);

        contas[8] = new ContaPoupança();
        contas[8].setSaldo(12233.0);

        contas[9] = new ContaSalario();
        contas[9].setSaldo(5600.0);

        double saldoGeral = 0.0;
        double saldoPosPeriodo = 0.0;
        for (ContaBancaria c : contas) {// cada iteração c receberá uma conta
            saldoGeral += c.getSaldo();
            c.cobrarTaxa();
            c.pagarJuros();
            saldoPosPeriodo += c.getSaldo();
        }
        System.out.println("Saldo Geral: " + saldoGeral + "R$");
        System.out.println("Saldo pós apuração: " + saldoPosPeriodo + "R$");
    }
}
