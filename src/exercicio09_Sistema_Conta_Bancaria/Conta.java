package exercicio09_Sistema_Conta_Bancaria;

public abstract class Conta {

    private String numeroConta;
    private double saldo;
    private String titular;

    public Conta(String numeroConta, double saldo, String titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;

    }

    public void depositar(double valor ) {

        if(valor <= 0) {
            System.out.println("Valor inválido.");
        }

        else {
            this.saldo = saldo;
            System.out.println("Valor depositado com sucesso!");
        }

    }

    public void exibirDadosDaConta() {
        System.out.println("==== Dados da Conta ====");
        System.out.println("Numero da conta: " + this.numeroConta);
        System.out.printf("Saldo: %.2f%n", this.saldo);
        System.out.println("Titular: " + this.titular);
    }

    public abstract double calcularTaxaMensal(double taxaMensal);

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

}
