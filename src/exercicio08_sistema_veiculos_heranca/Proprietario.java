package exercicio08_sistema_veiculos_heranca;

public class Proprietario {

    private String nome;
    private String cpf;


    public Proprietario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF:  " + this.cpf);
    }


    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return cpf;
    }
}
