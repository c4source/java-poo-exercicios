package exercicio08_sistema_veiculos_heranca;

public class Carro extends Veiculo {

    private int numeroPortas;

    public Carro(String marca, String modelo, int ano, Proprietario proprietario, int numeroPortas) {
        super(marca, modelo, ano, proprietario);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public void exibirDados() {
        super.exibirDados(); // CHAMA O METODO DA SUPERCLASSE DENTRO DO METODO EXIBIRDADOS, SUPER.NOMEMETODO .
        System.out.println("Numero de portas: " + this.numeroPortas);

    }

}
