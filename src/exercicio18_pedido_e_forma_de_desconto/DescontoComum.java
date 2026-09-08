package exercicio18_pedido_e_forma_de_desconto;

public class DescontoComum extends Desconto {

    @Override
    public double calcularDesconto(double valorCompra) {
        if (valorCompra <= 0) {
            throw new IllegalArgumentException("Valor inválido!");
        }
        else if (valorCompra < 300.0) {
            return 0.0;
        }
        else {
            return valorCompra * 0.05;
        }
    }


}
