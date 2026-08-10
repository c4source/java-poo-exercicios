package exercicio08_sistema_veiculos_heranca;

public class Moto extends Veiculo {

    private int cilindradas;

    public Moto(String marca, String modelo, int ano, Proprietario proprietario, int cilindradas) {
        super(marca, modelo, ano, proprietario);
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirDados() {
       super.exibirDados();
        System.out.println("Cilindradas: " + this.cilindradas);

    }

}
