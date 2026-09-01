package exercicio12_sistema_de_pagamento;

public class CartaoDeCredito extends Pagamento {

    private int numeroParcelas;

    public CartaoDeCredito(double valor, int numeroParcelas) {
        super(valor);
        if(numeroParcelas < 0){
            throw new IllegalArgumentException("Numero de parcelas inválidas");
        }
        this.numeroParcelas = numeroParcelas;
    }

    @Override
    public double calcularValorFinal(){
        return getValor() + (getValor() * 0.03);
    }


    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Acréscimo: 3%");
        System.out.println("Quantidades de parcelas: " + this.numeroParcelas);
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }
}
