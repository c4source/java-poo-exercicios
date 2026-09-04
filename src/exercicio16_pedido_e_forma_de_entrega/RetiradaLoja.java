package exercicio16_pedido_e_forma_de_entrega;

public class RetiradaLoja extends Entrega {

    private String codigoRetirada;

    public RetiradaLoja(String codigoRetirada) {
        if (codigoRetirada == null || codigoRetirada.isBlank()) {
            throw new IllegalArgumentException("Codigo Inválido");
        }
        this.codigoRetirada = codigoRetirada;
    }

    @Override
    public void realizarEntrega() {
        System.out.println("Pedido disponível para ser retirado na loja");
        System.out.println("Codigo de retirada: " + this.codigoRetirada);
    }


    public String getCodigoRetirada() {
        return codigoRetirada;
    }
}
