package exercicio09_Sistema_Conta_Bancaria;

public class Main {
    public static void main(String[] args) {

        ContaCorrente c1 = new ContaCorrente("777", 0.0,"Gabriel", 1000);
        ContaPoupanca p1 = new ContaPoupanca("222",0.0,"Osvaldo", 5.00);

        c1.depositar(2000);

        p1.depositar(1000);

        c1.depositar(235);
        p1.depositar(400);

        c1.exibirDados();
        p1.exibirDados();

        System.out.println(c1.calcularTaxaMensal());
        System.out.println(p1.calcularTaxaMensal());


    }
}
