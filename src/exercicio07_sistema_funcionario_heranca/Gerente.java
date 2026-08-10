package exercicio07_sistema_funcionario_heranca;

public class Gerente extends Funcionario {

        private double bonus;

        public Gerente(String nome, double salario) {
        super(nome, salario);
        this.bonus = 0;

         }

         public double calcularSalarioFinal(double bonus) {

            double salarioFinal;

            if (bonus <= 0 ) {
                return salario;

            }
            else {
                this.bonus = bonus;
                salarioFinal = salario + bonus;
            }
            return salarioFinal;

         }

         @Override
         public void exibirDados () {
             System.out.println("Nome: " + this.getNome());
             System.out.printf("Salario: %.2f%n", this.getSalario());
             System.out.printf("Bonus: %.2f%n", this.bonus);
        }

}



