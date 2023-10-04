public class Pessoa {
    private String nome;
    private String cpf;
    private double salario;

    public Pessoa() {
        nome = "";
        cpf = "";
        salario = 0.0;
    }

    String getNome() {
        return nome;
    }

    String getCPF() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) { // parametro
        this.nome = nome;
    }

    public void setCPF(String cpf) { // parametro
        this.cpf = cpf;
    }

    public void imprimirFichaPessoa() {
        System.out.println("***************");
        System.out.println("Nome..." + this.nome);
        System.out.println("CPF..." + this.cpf);
        System.out.println("Salário..." + this.salario);
        System.out.println("***************");
    }

    public void aumentarSalario(double salario) { // parametro
        System.out.println("Aumentou o Salário de " + this.salario + " para " + salario);
        this.salario = salario;

    }

}