package lab7;

public class PFisica extends Pessoa{
    private String cpf;
    private char sexo;
    private int estadoCivil;

    PFisica(String nome, String endereco, String telefone, String cpf, char sexo, int estadoCivil){
        super(nome, endereco, telefone);
        this.cpf = cpf;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
    }

    public String toString(){
        return super.toString() + "Dados de Pessoa Física:\n" + cpf + ", " + sexo + ", " + estadoCivil + "\n";
    }
}
