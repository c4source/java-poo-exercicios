package exercicio17_pedido_e_calculo_de_frete;

public class Pedido {

    private String numeroPedido;
    private double valorPedido;
    private Frete frete;

    public Pedido(String numeroPedido, double valorPedido, Frete frete) {
        if(numeroPedido == null || numeroPedido.isBlank()) {
            throw new IllegalArgumentException("Numero de Pedido inválido!");
        }
        this.numeroPedido = numeroPedido;

        if(valorPedido <= 0) {
            throw  new IllegalArgumentException("Valor de pedido inválido");
        }
        this.valorPedido = valorPedido;

        if(frete == null ) {
            throw new IllegalArgumentException("Frete inválido");
        }
        this.frete = frete;
    }

    public double calcularTotal(){
        //“Retorne o valor deste pedido somado ao frete calculado para este mesmo valor do pedido.”
       return this.valorPedido + this.frete.calcularFrete(this.valorPedido);
    }

    public void trocarFrete(Frete novoFrete) {
        if(novoFrete == null) {
            throw new IllegalArgumentException("Objeto inválido");
        }
        this.frete = novoFrete;
    }

    public void exibirResumo() {
        System.out.println("Numero do pedido: " + this.numeroPedido);
        System.out.printf("Valor do pedido: %.2f%n", this.valorPedido);
        System.out.println("Frete inicial: " + this.frete.getClass().getSimpleName()); // Imprime o tipo do objeto que ta em frete
        //que serve para descobrir o nome da classe real do objeto que aquela referência está apontando.
    }
}
