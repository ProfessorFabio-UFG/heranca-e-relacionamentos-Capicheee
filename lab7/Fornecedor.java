package lab7;

public class Fornecedor extends PJuridica{
    protected String produto;

    Fornecedor(String produto, String nome, String endereco, String telefone, String cnpj, String razaoSocial){
        super(nome, endereco, telefone, cnpj, razaoSocial);
        this.produto = produto;
    }

    public String getProduto(){
        return produto;
    }

    public void setProduto(String produto){
       this.produto = produto; 
    }

    public String toString(){
        return super.toString() + "Dados do fornecedor:\n" + produto + "\n";
    }
}
