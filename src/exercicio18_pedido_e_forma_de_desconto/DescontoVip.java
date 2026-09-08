package exercicio18_pedido_e_forma_de_desconto;

public class DescontoVip extends Desconto {

    @Override
    public double calcularDesconto(double valorCompra) {
        if (valorCompra <= 0) {
            throw new IllegalArgumentException("Valor invalído");
        }
        else  {
            return valorCompra * 0.10;
        }
    }


}
