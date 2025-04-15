package lab7;

public class Cliente extends PFisica{
    protected double renda;
    protected String interesses;
    protected String profissao;

    Cliente(double renda, String interesses, String profissao, String nome, String endereco, String telefone, String cpf, char sexo, int estadoCivil){
        super(nome, endereco, telefone, cpf, sexo, estadoCivil);
        this.renda = renda;
        this.interesses = interesses;
        this.profissao = profissao;
    }

    public double getRenda(){
        return renda;
    }

    public String getInteresses(){
        return interesses;
    }

    public String getProfissao(){
        return profissao;
    }

    public void setRenda(double renda){
        this.renda = renda;
    }

    public void setProfissao(String profissao){
        this.profissao = profissao;
    }

    public void setInteresses(String interesses){
        this.interesses = interesses;
    }

    public String toString(){
        return super.toString() + "Dados do cliente:\n" + renda + ", " + interesses + ", " + profissao + "\n";
    }
}