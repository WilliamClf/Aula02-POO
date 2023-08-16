public class Email {
      String emailOrigem;
      String emailDestino;
      String emailTexto;
      String texto;

      void imprimir() {
           System.out.println(texto);
      }

      boolean validar() {
        if ((!texto.isEmpty() ) && (!emailDestino.isEmpty()) && (!emailTexto.isEmpty())){
            return true;
        } else {
            return false;
        }
      }

      void enviar(){
           System.out.println("*************");
           System.out.println("Origem..."+emailOrigem);
           System.out.println("Destino..."+emailDestino);
           System.out.println("Texto..."+emailTexto);
           System.out.println("*************");
      }
}