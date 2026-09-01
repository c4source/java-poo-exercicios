package exercicio13_sistem_de_notificao;
// ===================== DELEGACAO ==========================
public class Usuario {

    private String nome;
    private Notificacao notificacao; //Associacao; pode receber um objeto do tipo Notificacao dentro desse atributo.

    public Usuario(String nome, Notificacao notificacao) {
        if(nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        this.nome = nome;
        if(notificacao == null) {
            throw new IllegalArgumentException("Notificacao inválida");
        }
        this.notificacao = notificacao;
    }

    public void receberAviso(String mensagem){
        notificacao.enviarMensagem(mensagem);
    }

    //O usuario quer alterar, qual tipo de notificacao ele quer (sms ou email). Por isso o tipo é Notificacao.
    //E altereamos o atributo da classe notificacação pela novaNotificacao
    public void alterarNotificacao(Notificacao novaNotificacao){
        this.notificacao = novaNotificacao;
    }


    public String getNome() {
        return nome;
    }

    public Notificacao getNotificacao() {
        return notificacao;
    }
}
