package exercicio16_pedido_e_forma_de_entrega;

public class Main {
    public static void main(String[] args) {


        Entrega e1 = new EntregaMoto("Gabriel");
        Entrega e2 = new RetiradaLoja("PARA2611");

        Pedido p1 = new Pedido("6827", e1);

        p1.processarEntrega();
        p1.trocarEntrega(e2);
        p1.processarEntrega();


    }
}
