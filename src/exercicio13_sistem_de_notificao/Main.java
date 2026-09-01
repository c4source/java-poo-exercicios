package exercicio13_sistem_de_notificao;

public class Main {
    public static void main(String[] args) {

       Notificacao notificacao = new Email("gabrielhenriques@.com");
       Notificacao notificacao2 = new Sms("189967815");

       Usuario p1 = new Usuario("Gabriel", notificacao);

       p1.receberAviso("Pedido aprovado");
       p1.alterarNotificacao(notificacao2);
       p1.receberAviso("Pedido saiu para entrega");




    }
}
