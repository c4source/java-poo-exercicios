package exercicio06_time_futebol;

public class Jogador{

    private String nome;
    private String posicao;
    private int camisa;

    public Jogador(String nome, String posicao, int camisa) {
        this.nome = nome;
        this.posicao = posicao;
        this.camisa = camisa;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", posicao='" + posicao + '\'' +
                ", camisa=" + camisa +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public int getCamisa() {
        return camisa;
    }
}
