package exercicio16_pedido_e_forma_de_entrega;

public class Pedido {

    private String numeroPedido;
    private Entrega entrega;

    public Pedido(String numeroPedido, Entrega entrega) {
        if(numeroPedido == null || numeroPedido.isBlank()) {
            throw new IllegalArgumentException("Numero de pedido inválido");
        }
        if(entrega == null ) {
            throw new IllegalArgumentException("Objeto inválido!");
        }
        this.numeroPedido = numeroPedido;
        this.entrega = entrega;
    }

    public void processarEntrega() {
        this.entrega.realizarEntrega();
    }

    public void trocarEntrega(Entrega entrega) {
        this.entrega = entrega;
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public Entrega getEntrega() {
        return entrega;
    }
}
