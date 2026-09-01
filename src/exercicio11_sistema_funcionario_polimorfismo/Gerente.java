package exercicio11_sistema_funcionario_polimorfismo;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);

    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Bonus: 20%");
    }

    @Override
    public double calcularBonus(){
        return this.getSalario() * 0.20;
    }

}
