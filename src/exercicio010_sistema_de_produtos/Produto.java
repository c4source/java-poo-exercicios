package exercicio010_sistema_de_produtos;

//Clase pai.
public abstract class Produto {

    private String nome;
    private double precoBase;

    public Produto(String nome, double precoBase)  {

        //.isBlank valida se a string é igual a "" ou "  ".
        if(nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Dados do nome inválidos");
        }

        this.nome = nome;

        if (precoBase <= 0) {
            throw new IllegalArgumentException("Preço base não é válido.");
        }

        this.precoBase = precoBase;

    }

    //Preco base deve ser maior que 0
    //Deve exibir os dados.
    //Possuir metodo abstrato

    public void exibirDados() {
        System.out.printf("Nome: %s", nome);
        System.out.printf("\nprecoBase: %.2f%n", precoBase);
    }

    public abstract double calcularProdutoFinal();

    public String getNome() {
        return this.nome;
    }

    public double getPrecoBase(){
        return this.precoBase;
    }

}
