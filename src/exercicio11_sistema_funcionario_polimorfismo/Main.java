package exercicio11_sistema_funcionario_polimorfismo;

public class Main {
    public static void main(String[] args) {



        //Variavel de referencia (f1) é do tipo Funcionario e gerente e o objeto
        //Funciona por que gerente extends funcionario. --> Gerente é um Funcionario
        //Uma referência da classe mãe pode apontar para um objeto de uma classe filha,
        //e o metodo sobrescrito executado será o da filha.
        Funcionario f1 = new Gerente("Roberta", 4000.0);
        Funcionario f2 = new Desenvolvedor("Gabriel", 5000.00, "Java");

        f1.exibirDados();
        System.out.printf("Valor do bonus: R$ ");
        System.out.println(f1.calcularBonus());

        System.out.println("");

        f2.exibirDados();
        System.out.printf("Valor do bonus: R$ ");
        System.out.println(f2.calcularBonus());


    }






}
