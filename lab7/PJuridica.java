package lab7;

public class PJuridica extends Pessoa{
    private String cnpj;
    private String razaoSocial;

    PJuridica(String nome, String endereco, String telefone, String cnpj, String razaoSocial){
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public String toString(){
        return super.toString() + "Dados de Pessoa Jurídica:\n" + cnpj + ", " + razaoSocial + "\n";
    }
}
