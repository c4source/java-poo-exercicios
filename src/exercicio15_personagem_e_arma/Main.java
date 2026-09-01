package exercicio15_personagem_e_arma;

public class Main {
    public static void main(String[] args) {


        Arma espada = new Espada("Anduril");
        Arma arco = new Arco("Galadhrim");

        Personagem p1 = new Personagem("Gandalf", arco);


        p1.trocarArma(espada);
        p1.atacar();
    }

}
