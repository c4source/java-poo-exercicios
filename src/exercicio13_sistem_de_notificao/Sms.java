package exercicio13_sistem_de_notificao;

public class Sms extends Notificacao {


    private String telefone;

    public Sms(String telefone){
        if (telefone == null || telefone.isBlank()) {
            throw new IllegalArgumentException("Telefone inválido");
        }
        this.telefone = telefone;
    }

    @Override
    public void enviarMensagem(String mensagem){
        System.out.println("Enviando SMS para: " + this.telefone);
        System.out.println("Mensagem: Sua compra foi aprovada.");

    }

    public String getTelefone() {
        return telefone;
    }
}
