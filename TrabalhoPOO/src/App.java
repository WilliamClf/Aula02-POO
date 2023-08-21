import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Insira o número da sua matricula: ");
        String numMatricula = sc.nextLine();

        System.out.println("Insira seu endereço: ");
        String endereco = sc.nextLine();

        System.out.println("Insira a sua primeira nota");
        double nota1 = sc.nextDouble();

        System.out.println("Insira a sua segunda nota");
        double nota2 = sc.nextDouble();

        System.out.println("Insira a sua terceira nota");
        double nota3 = sc.nextDouble();

        Aluno al = new Aluno();

        al.setNome(nome);
        al.setNumMatricula(numMatricula);
        al.setEndereco(endereco);
        al.setNota1(nota1);
        al.setNota2(nota2);
        al.setNota3(nota3);
        al.imprimirFichaAluno();

    }
}
