package exercicio14_pessoa_meio_de_transporte;

public class Pessoa {

    private String nome;

    private Transporte transporte;

    public Pessoa(String nome, Transporte transporte) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        if(transporte == null) {
            throw new IllegalArgumentException("Transporte inválido");
        }
        this.nome = nome;
        this.transporte = transporte;
    }


    public void locomover(){
        this.transporte.mover();
    }

    public void alterarTrasnporte(Transporte novoTransporte) {
        if(novoTransporte == null ) {
            throw new IllegalArgumentException("Novo Transporte inválido!");
        }
        this.transporte = novoTransporte;
    }


    public String getNome() {
        return nome;
    }
}
