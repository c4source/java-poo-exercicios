package exercicio010_sistema_de_produtos;


public class ProdutoFisico extends Produto {

    private double frete;

    public ProdutoFisico(String nome, double precoBase, double frete) {
        super(nome, precoBase);
        if (frete < 0) {
            throw new IllegalArgumentException("Valor do frete inválido.");
        } //Nao precisa de else em throw, ja acaba quando é dropado a exeception
        this.frete = frete;

    }

    @Override
    public double calcularProdutoFinal() {
        double valorFinal;

        valorFinal = this.getPrecoBase() + frete;
        return valorFinal;

    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.printf("Frete: R$ %.2f%n", this.frete);
    }


}
