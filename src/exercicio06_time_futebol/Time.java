package exercicio06_time_futebol;

public class Time {

    private String nome;
    private Jogador[] jogadores;

    public Time (String nome) {
        this.nome = nome;
        this.jogadores = new Jogador[5]; //Cria um vetor vazio de cinco posicoes.
    }


    // Regras:
    //  - O time pode possuir no máximo 5 jogadores.
    //  - Não é permitido adicionar um jogador em uma posição já ocupada do vetor.
    //  - Ao exibir os jogadores, devem aparecer apenas as posições ocupadas.

    public void adicionarJogador (Jogador jogador) {
        if (this.jogadores[0] == null && this.jogadores[1] == null  ) {
            this.jogadores[0] = jogador;
            System.out.printf("Jogador %d adicionado com sucesso ao time");
        }
        else {
            System.out.println("Jogador n pode ser adicionado");
        }

    }



    public String getNome() {
        return nome;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }
}
