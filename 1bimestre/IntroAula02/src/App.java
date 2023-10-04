public class App {
    public static void main(String[] args) {
        ContaBancaria ct;
        ct = new ContaBancaria("William", 123.45, "BRADESCO",
                "89", "989");
        System.out.println("#################");
        // ct.banco = "CAIXA"
        System.out.println(ct.banco);

        // ct.saldo = 200.50;
        System.out.println(ct.saldo);

        // ct.correntista = "William";
        System.out.println(ct.correntista);

        // ct.agencia = "046";
        System.out.println(ct.agencia);

        // ct.conta = "45332221";
        System.out.println(ct.conta);
        System.out.println("#################");
    }
}
