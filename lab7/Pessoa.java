package lab7;

public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    
    Pessoa(String nome, String endereco, String telefone){
        this.endereco = endereco;
        this.nome = nome;
        this.telefone = telefone;
    }

    public String toString(){
        return "Dados pessoais:\n" + endereco + ", " + nome + ", " + telefone + "\n";
    }
}
