package exercicio08_sistema_veiculos_heranca;

public class Veiculo {

    private String marca;
    private String modelo;
    private int ano;
    private Proprietario proprietario;

    public Veiculo(String marca, String modelo, int ano, Proprietario proprietario) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.proprietario = proprietario;
    }


   public void exibirDados() {
       System.out.println(" === Dados gerais do veiculo ===");
       System.out.println("Marca: " + this.getMarca());
       System.out.println("Modelo: " + this.getModelo());
       System.out.println("Ano: " + this.getAno());
       System.out.println("Proprietario: " + this.getProprietario().getNome());

   }


    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }
}
