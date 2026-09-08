package exercicio18_pedido_e_forma_de_desconto;

public class Main {
    public static void main(String[] args) {

        Desconto descontoComum = new DescontoComum();
        Desconto descontoVip = new DescontoVip();

        Pedido p1 = new Pedido("CBA-321", 500.0, descontoComum);

       p1.exibirResumo();
       p1.trocarDesconto(descontoVip);
        System.out.println("===============");
       p1.exibirResumo();
    }
}
