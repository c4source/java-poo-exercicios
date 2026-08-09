package exercicio06_time_futebol;

public class Main {
    public static void main(String[] args) {


        /*

        # Exercício 6 — Time de Futebol
        Um clube deseja um sistema simples para controlar seus jogadores.

        ## Jogador

        Cada jogador possui:

        - Nome
        - Posição
        - Número da camisa

        O jogador deve poder:

        - Exibir seus dados.

        ## Time

        Cada time possui:

        - Nome
        - Vetor de jogadores (máximo de 5)

        O time deve permitir:

        - Adicionar um jogador;
        - Exibir todos os jogadores cadastrados;
        - Informar quantos jogadores estão cadastrados.

        ## Regras

        - O time pode possuir no máximo 5 jogadores.
        - Não é permitido adicionar um jogador em uma posição já ocupada do vetor.
        - Ao exibir os jogadores, devem aparecer apenas as posições ocupadas.

        ## Main

        - Crie um time.
        - Crie cinco jogadores.
        - Adicione os jogadores ao time.
        - Tente adicionar um sexto jogador.
        - Exiba todos os jogadores.
        - Exiba a quantidade de jogadores cadastrados.
         */
        Time time1 = new Time("Santos");
        Jogador j1 = new Jogador("Gabriel", "Lateral", 10);

        //time1.adicionarJogador();







    }
}
// vou criar um time que tem 5 jogadores.
// vou criar um time que pode possuir no máximo cinco jogadores
// um time possui n jogadores.

//logo pra armazenar os jogadores (objetos) dentro do time, eu preciso criar um vetor de 5 indices p receber os jogadores
// Eu vou criar isso dentro do construtor, um vetor vazio para receber dps os objetos