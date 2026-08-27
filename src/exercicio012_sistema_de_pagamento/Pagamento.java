package exercicio012_sistema_de_pagamento;

public abstract class Pagamento {

    private double valor;

    public Pagamento(double valor) {
        if(valor <= 0) {
            throw new IllegalArgumentException("Valor inválido");

        }
        this.valor = valor;
    }


    public abstract double calcularValorFinal();

    public void exibirDados(){
        System.out.printf("Valor: R$ %.2f%n", this.valor);
    }

    public double getValor() {
        return valor;
    }
}
