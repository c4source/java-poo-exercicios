package exercicio17_pedido_e_calculo_de_frete;

public class Main {
    public static void main(String[] args) {

        Frete freteExpresso = new FreteExpresso();
        Frete freteNormal = new FreteNormal();

        Pedido pedido = new Pedido("abc1234", 200, freteExpresso);

        pedido.trocarFrete(freteNormal);
        pedido.exibirResumo();
        System.out.printf("Valor total com frete: R$ ");
        System.out.println(pedido.calcularTotal());



    }
}
