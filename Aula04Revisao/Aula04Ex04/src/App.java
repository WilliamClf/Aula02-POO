public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p = new Pessoa();
        p.setNome("William");
        p.setCPF("111-222-333-44");
        p.aumentarSalario(1600);
        p.imprimirFichaPessoa();
    }
}
