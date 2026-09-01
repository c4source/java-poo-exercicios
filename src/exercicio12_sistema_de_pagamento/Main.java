package exercicio12_sistema_de_pagamento;

public class Main {
    public static void main(String[] args) {

        Pagamento p1 = new Pix(2500, "gabriel@gmail.com");
        Pagamento p2 = new CartaoDeCredito(2500, 4);

        p1.exibirDados();
        System.out.printf("Valor final: R$ ");
        System.out.println(p1.calcularValorFinal());

        System.out.println("");

        p2.exibirDados();
        System.out.printf("Valor final: R$ ");
        System.out.println(p2.calcularValorFinal());




    }
}
