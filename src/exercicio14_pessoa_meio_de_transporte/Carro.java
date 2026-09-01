package exercicio14_pessoa_meio_de_transporte;

public class Carro extends Transporte{
    private String modelo;


    public Carro(String modelo) {
        if(modelo == null || modelo.isBlank()) {
            throw new IllegalArgumentException("Modelo inválido");
        }
        this.modelo = modelo;

    }

    @Override
    public void mover(){
        System.out.println("O carro está se locomovendo pela estrada");
    }


}
