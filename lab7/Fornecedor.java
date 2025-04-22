package lab7;

import java.util.Scanner;

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

    public Fornecedor registraFornecedor(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nome:");
        String nomeFornecedor = sc.nextLine();
        System.out.println("Endereço:");
        String enderecoFornecedor = sc.nextLine();
        System.out.println("Telefone:");
        String telefoneFornecedor = sc.nextLine();
        System.out.println("CNPJ:");
        String cnpj = sc.nextLine();
        System.out.println("Razão Social:");
        String razaoSocial = sc.nextLine();
        System.out.println("Produto:");
        String produto = sc.nextLine();
        
        return new Fornecedor(produto, nomeFornecedor, enderecoFornecedor, telefoneFornecedor, cnpj, razaoSocial);
    }
}
