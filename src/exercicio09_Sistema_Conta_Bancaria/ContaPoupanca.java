package exercicio09_Sistema_Conta_Bancaria;

public class ContaPoupanca extends Conta {

    private double taxaRendimento;

    public ContaPoupanca(String numeroConta, double saldo, String titular, double taxaRendimento) {
        super(numeroConta, saldo, titular);
        this.taxaRendimento = taxaRendimento;
    }

    public void exibirDados () {
        super.exibirDadosDaConta();
        System.out.printf("Taxa de rendimento: %.2f%n", this.taxaRendimento);
    }
    @Override
    public double calcularTaxaMensal(){
        return 0.0;
    }

}
