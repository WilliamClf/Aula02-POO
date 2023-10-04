public class ContaBancaria {
    String correntista;
    double saldo;
    String banco;
    String agencia;
    String conta;

    ContaBancaria(String pcorrentista, double psaldo, // P = parâmetro
            String pbanco, String pagencia, String pconta) {
        correntista = pcorrentista;
        saldo = psaldo;
        banco = pbanco;
        agencia = pagencia;
        conta = pconta;
    }
}
