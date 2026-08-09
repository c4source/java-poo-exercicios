package exercicio07_sistema_funcionario_heranca;

public  class Funcionario {

    // classe pai, as sub-classes irao herdar metodos e atributos nela.
    // Metodo abstrato é posto aqui.

    protected String nome;
    protected double salario;

    public Funcionario (String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }


    public void exibirDados() {
        System.out.println("Nome: " + this.getNome());
        System.out.printf("Salario: %.2f%n", this.getSalario());

    }


    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario (double salario)  {
        this.salario = salario;
    }
}
