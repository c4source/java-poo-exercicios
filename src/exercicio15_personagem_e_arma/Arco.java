package exercicio15_personagem_e_arma;

public class Arco extends Arma{

    private String modelo;

    public Arco(String modelo) {
        if (modelo == null || modelo.isBlank()) {
            throw new IllegalArgumentException("Modelo inválido");
        }
        this.modelo = modelo;
    }

    @Override
    public void atacar(){
        System.out.println("Atirando com o arco do Legolas!");
    }

    public String getModelo() {
        return modelo;
    }
}
