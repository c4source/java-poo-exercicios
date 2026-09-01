package exercicio11_sistema_funcionario_polimorfismo;

public class Desenvolvedor extends Funcionario {

        private String linguagemPrincipal;

        public Desenvolvedor(String nome, double salario, String linguagemPrincipal) {
            super(nome, salario);
            if (linguagemPrincipal == null || linguagemPrincipal.isBlank()) {
                throw new IllegalArgumentException("Linguagem inválida");
            }
            this.linguagemPrincipal = linguagemPrincipal;
        }

        @Override
        public void exibirDados(){
            super.exibirDados();
            System.out.println("Bonus: 10%");
            System.out.println("Linguagem Principal: " + this.linguagemPrincipal);
        }

        @Override //Coloque sempre a annotation sobrescrever para o compilador achar possiveis erros.
        public double calcularBonus(){
            return this.getSalario() * 0.10;
        }




    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }
}
