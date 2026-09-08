package exercicio18_pedido_e_forma_de_desconto;

public class Pedido {

    private String codigo;
    private double valorCompra;
    private Desconto desconto;

    public Pedido(String codigo, double valorCompra, Desconto desconto) {

        if(codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("Código inválido");
        }
        this.codigo = codigo;

        if (valorCompra <= 0) {
            throw new IllegalArgumentException("Valor inválido");
        }
        this.valorCompra = valorCompra;

        if (desconto == null) {
            throw  new IllegalArgumentException("Objeto invalido");
        }
        this.desconto = desconto;

    }

    public double calcularValorFinal() {
        return this.valorCompra - this.desconto.calcularDesconto(this.valorCompra);
    }

    public void trocarDesconto(Desconto novoDesconto) {
        if (novoDesconto == null) {
            throw new IllegalArgumentException("Desconto inválido");
        }
        this.desconto = novoDesconto;
    }
    public void exibirResumo() {

        double valorDesconto = this.desconto.calcularDesconto(this.valorCompra);

        System.out.println("Tipo de desconto: " + this.desconto.getClass().getSimpleName());
        System.out.println("Codigo do pedido: " + this.codigo);
        System.out.printf("Compra: R$ %.2f%n", this.valorCompra);
        System.out.printf("desconto:  %.2f%n", valorDesconto);
        System.out.printf("Valor final: R$ %.2f%n", this.calcularValorFinal());
    }

}
