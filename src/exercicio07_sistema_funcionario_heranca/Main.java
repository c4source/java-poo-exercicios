package exercicio07_sistema_funcionario_heranca;

public class Main {
    public static void main(String[] args) {

        Gerente g1 = new Gerente("Gabriel", 2000);
        Desenvolvedor d1 = new Desenvolvedor("Pamela", 5000, "Java");



        g1.exibirDados();
        g1.calcularSalarioFinal(200.50);
        g1.exibirDados();
        d1.exibirDados();






    }
    /*
    #   Exercício 6 — Sistema de Funcionários (Herança)
        Uma empresa possui dois tipos de funcionários.

        ## Funcionário (Classe Pai)

        Possui:

        - Nome
        - Salário

        Deve permitir:

        - Exibir seus dados.

        ---

        ## Gerente

        Herda de Funcionário.

        Possui:

        - Bônus

        Deve permitir:

        - Calcular salário final (salário + bônus).

        ---

        ## Desenvolvedor

        Herda de Funcionário.

        Possui:

        - Linguagem principal

        Deve permitir:

        - Exibir seus dados incluindo a linguagem.

        ---

        ## Regras

        - Utilize herança.
        - Reaproveite os atributos da classe Funcionário.
        - Utilize `super` no construtor das classes filhas.
        - Sobrescreva (`@Override`) o método de exibir dados nas classes filhas.

        ---

        ## Main

        - Crie um gerente.
        - Crie um desenvolvedor.
        - Exiba os dados dos dois.


     */

  ;





}
