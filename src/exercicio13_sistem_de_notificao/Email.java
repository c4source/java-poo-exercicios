package exercicio13_sistem_de_notificao;

public class Email extends Notificacao {


    private String email;

    public Email(String email) {
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Dados inválidos");
        }
        this.email = email;
    }


    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando email para: " + this.email);
        System.out.println("Mensagme: Sua compra foi aprovada!");

    }
    public String getEmail() {
        return email;
    }
}
