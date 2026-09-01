package exercicio12_sistema_de_pagamento;

public class Pix extends Pagamento {

    private String chavePix;

    public Pix(double valor, String chavePix){
        super(valor);
        if(chavePix == null || chavePix.isBlank()) {
            throw new IllegalArgumentException("Chave pix inválida");
        }
        this.chavePix = chavePix;
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Desconto: 5%");
        System.out.println("Chave pix: " + this.chavePix);
    }

    @Override
    public double calcularValorFinal(){
        return getValor() - (getValor() * 0.05);
    }

    public String getChavePix() {
        return chavePix;
    }
}
