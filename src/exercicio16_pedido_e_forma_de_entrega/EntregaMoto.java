package exercicio16_pedido_e_forma_de_entrega;

public class EntregaMoto extends Entrega {


    private String nomeEntregador;

    public EntregaMoto(String nomeEntregador) {
        if(nomeEntregador == null || nomeEntregador.isBlank()) {
            throw  new IllegalArgumentException("Nome inválido");
        }
        this.nomeEntregador = nomeEntregador;
    }

    @Override
    public  void realizarEntrega() {
        System.out.println("Entrega feita por moto");
        System.out.println("Entregador: " + this.nomeEntregador);
    }


    public String getNomeEntregador() {
        return nomeEntregador;
    }
}
