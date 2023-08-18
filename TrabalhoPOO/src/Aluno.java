public class Aluno {
   String nome;
   String numMatricula;
   String endereco;
   double nota1;
   double nota2;
   double nota3;

   Aluno() {
      this.nome = "";
      this.numMatricula = "";
      this.endereco = "";
      this.nota1 = 0;
      this.nota2 = 0;
      this.nota3 = 0;
   }

   Aluno(String nome, String numMatricula) {
      this.nome = "";
      this.numMatricula = "";
      this.endereco = "";
      this.nota1 = 0;
      this.nota2 = 0;
      this.nota3 = 0;
   }

   String getNome() {
      return this.nome;
   }

   void setNome(String nome) {
      this.nome = nome;
   }

   String getNumMatricula() {
      return this.numMatricula;
   }

   void setNumMatricula(String numMatricula) {
      this.numMatricula = numMatricula;
   }

   String getEndereco() {
      return this.endereco;
   }

   void setEndereco(String endereco) {
      this.endereco = endereco;
   }

   double getNota1() {
      return this.nota1;
   }

   void setNota1(double nota1) {
      this.nota1 = nota1;
   }

   double getNota2() {
      return this.nota2;
   }

   void setNota2(double nota2) {
      this.nota2 = nota2;
   }

   double getNota3() {
      return this.nota3;
   }

   void setNota3(double nota3) {
      this.nota3 = nota3;
   }

   double calcularMedia() {
      return (nota1 + nota2 + nota3) / 3;
   }

   public boolean validar() {
      return nome.length() >= 3 && numMatricula.length() >= 3 && endereco.length() >= 3;
   }

   void imprimirFichaAluno() {
      System.out.println("*****************");
      System.out.println("Nome do Aluno: " + getNome());
      System.out.println("Matrícula: " + getNumMatricula());
      System.out.println("Endereço: " + getEndereco());
      double media = this.calcularMedia();
      System.out.println(media);
      Boolean validacao = this.validar();
      System.out.println("Cadastro Válido: "+validacao);
      System.out.println("*****************");
   }
}
