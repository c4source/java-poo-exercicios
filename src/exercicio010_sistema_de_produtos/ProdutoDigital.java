package exercicio010_sistema_de_produtos;

public class ProdutoDigital extends Produto{

    private double desconto;

    public ProdutoDigital(String nome, double precoBase, double desconto) {
        super(nome, precoBase);

        if(desconto < 0 || desconto > 100) {
            throw new IllegalArgumentException("Dados inválido.");
        }

        this.desconto = desconto;


    }

    @Override
    public double calcularProdutoFinal() {

        double descontoPorcentagem;
        double precoFinal;

        descontoPorcentagem = this.getPrecoBase() * (desconto / 100);
        precoFinal = this.getPrecoBase() - descontoPorcentagem;
        return precoFinal;

    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.printf("desconto: %.0f%%%n", this.desconto);
    }



}
