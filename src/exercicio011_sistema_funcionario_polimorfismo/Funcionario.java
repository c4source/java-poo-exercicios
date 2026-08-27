package exercicio011_sistema_funcionario_polimorfismo;

public abstract class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {

        //PRIMEIRO VER SE É NULL, DEPOIS SE É BLANK "" "   " e dps ve o salario
        if(nome == null || nome.isBlank()  || salario <= 0) {
            throw new IllegalArgumentException("Dados do objeto inválido    !");
        }
        else {
            this.nome = nome;
            this.salario = salario;
        }
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void exibirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.printf("salario: R$ %.2f%n", this.salario);


    }

    public abstract double calcularBonus();


}
