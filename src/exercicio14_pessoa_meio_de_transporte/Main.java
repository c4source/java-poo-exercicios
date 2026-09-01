package exercicio14_pessoa_meio_de_transporte;

public class Main {
    public static void main(String[] args) {

        Transporte t1 = new Bicicleta("Especialized");
        Transporte t2 = new Carro("Voyage");

        Pessoa p1 = new Pessoa("Gabriel", t1);

        p1.locomover();
        p1.alterarTrasnporte(t2);
        p1.locomover();


    }
}
