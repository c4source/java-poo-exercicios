package exercicio14_pessoa_meio_de_transporte;

public class Bicicleta extends Transporte{

    private String marca;

    public Bicicleta(String marca){
        if(marca == null || marca.isBlank()) {
            throw new IllegalArgumentException("Marca inválida");
        }
        this.marca = marca;
    }

    @Override
    public void mover(){
        System.out.println("A bicicleta está se locomovendo pela ciclovia");
    }



}
