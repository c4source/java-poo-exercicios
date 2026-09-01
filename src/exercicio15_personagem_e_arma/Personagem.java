package exercicio15_personagem_e_arma;

public class Personagem {

    private String nome;
    private Arma arma;

    public Personagem(String nome, Arma arma) {

        if(nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome inválido!");
        }
        this.nome = nome;

        if(arma == null) {
            throw new IllegalArgumentException("Arma inválida");
        }
        this.arma = arma;

    }

    public void atacar(){
        this.arma.atacar();
    }

    public void trocarArma(Arma armaNova){
        if(armaNova == null) {
            throw new IllegalArgumentException("ArmaNova inválida!");
        }
        this.arma = armaNova;

    }

    public String getNome() {
        return nome;
    }

    public Arma getArma() {
        return arma;
    }
}
