public class App {
    public static void main(String[] args) throws Exception {
        Email em = new Email();
        em.emailOrigem = "emaildoiago@gmail.com";
        em.emailDestino = "teste@unimater.com";
        em.emailTexto = "ABCDE";
        em.texto = "test";

        em.imprimir();
        if (em.validar()) {
            em.enviar();
        }
    }
}
