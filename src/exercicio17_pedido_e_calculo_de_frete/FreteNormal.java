package exercicio17_pedido_e_calculo_de_frete;

public class FreteNormal extends Frete {

    /*
    regras de negocio:
    Se o valor do pedido for menor que R$ 200,00, o frete custa R$ 20,00.
    Se o valor do pedido for R$ 200,00 ou mais, o frete é grátis.
     */

    @Override
    public double calcularFrete(double valorDoPedido) {
        double freteNormal;

        //Sempre valide o primeiro o valor inválido
        if(valorDoPedido < 0) {
            throw new IllegalArgumentException("Valor inválido");
        }
         else if (valorDoPedido < 200) {
            return freteNormal = 20.0;
        }
        else {
            return 0.0;
        }
    }


}
