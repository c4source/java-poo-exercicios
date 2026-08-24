package exercicio010_sistema_de_produtos;

public class Main {
    public static void main(String[] args) {

        //instanciar

        ProdutoDigital produtoDigital1 = new ProdutoDigital("Battlefield 3 premium", 150.0, 25.0);
        ProdutoFisico produtoFisico1 = new ProdutoFisico("Teclado Hyperx", 100, 20);

        produtoFisico1.exibirDados();
        System.out.println(produtoFisico1.calcularProdutoFinal());
        produtoDigital1.exibirDados();
        System.out.println(produtoDigital1.calcularProdutoFinal());


    }
}
