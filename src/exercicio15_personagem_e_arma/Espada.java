package exercicio15_personagem_e_arma;

public class Espada extends Arma{

    private String nome;

    public Espada(String nome) {
        if(nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome inválido!");
        }
        this.nome = nome;
    }

    @Override
    public void atacar(){
        System.out.println("Atacando com a espada de Anduril");
    }

    public String getNome() {
        return nome;
    }
}
