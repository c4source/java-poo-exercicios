package exercicio17_pedido_e_calculo_de_frete;

public class FreteExpresso extends Frete{

    @Override
    public double calcularFrete(double valorPedido) {


        if(valorPedido < 0) {
            throw new IllegalArgumentException("Valor Inválido!");
        }
        else {
            return 35.0;
        }
    }

}
