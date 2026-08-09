package exercicio07_sistema_funcionario_heranca;

public class Desenvolvedor extends Funcionario {

    private String linguagemPrincipal;

    public Desenvolvedor(String nome, double salario, String linguagemPrincipal) {
        super(nome, salario);
        this.linguagemPrincipal = linguagemPrincipal;
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + this.getNome());
        System.out.printf("Salario: %.2f%n", this.getSalario());
        System.out.println("Linguagem principal: " + this.linguagemPrincipal);
    }


}
