package exercicio08_sistema_veiculos_heranca;

public class Main {
    public static void main(String[] args) {


        Proprietario p1 = new Proprietario("Pamela", "778-965-858-95");
        Proprietario p2 = new Proprietario("Laura", "778-965-998-95");

        Carro c1 = new Carro("chevrolet", "opala", 68, p2, 4);
        Moto m1 = new Moto("Yamaha", "R1", 2008, p1, 1200);

        p1.exibirDados();
        System.out.println("");
        p2.exibirDados();

        System.out.println("");

        c1.exibirDados();
        m1.exibirDados();


        //  super(...)            // chama construtor da mãe
        // super.exibirDados()   // chama método da mãe



    }
}
