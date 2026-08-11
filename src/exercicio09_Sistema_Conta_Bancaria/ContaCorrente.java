package exercicio09_Sistema_Conta_Bancaria;

public class ContaCorrente extends Conta {

    public double limite;

    public ContaCorrente(String numeroConta, double saldo, String titular, double limite) {
        super(numeroConta, saldo, titular);
        this.limite = limite;
    }

    public void exibirDados() {
        super.exibirDadosDaConta();
        System.out.printf("Limite: %.2f%n", limite);
    }

    @Override
    public double calcularTaxaMensal (double taxaMensal) {


    }

}
