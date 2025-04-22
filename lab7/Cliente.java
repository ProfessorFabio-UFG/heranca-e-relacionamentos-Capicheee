package lab7;

import java.util.Scanner;

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

    public Cliente registraCliente(){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nome:");
        String nomeCliente = sc.nextLine();
        System.out.println("Endereço:");
        String enderecoCliente = sc.nextLine();
        System.out.println("Telefone:");
        String telefoneCliente = sc.nextLine();
        System.out.println("CPF:");
        String cpfCliente = sc.nextLine();
        System.out.println("Sexo (M/F):");
        char sexoCliente = sc.nextLine().charAt(0);
        System.out.println("Estado civil (1-Solteiro, 2-Casado, 3-Divorciado, 4-Viúvo):");
        int estadoCivilCliente = Integer.parseInt(sc.nextLine());
        System.out.println("Renda:");
        double renda = Double.parseDouble(sc.nextLine());
        System.out.println("Interesses:");
        String interesses = sc.nextLine();
        System.out.println("Profissão:");
        String profissao = sc.nextLine();
        
        return new Cliente(renda, interesses, profissao, nomeCliente, enderecoCliente, telefoneCliente, cpfCliente, sexoCliente, estadoCivilCliente);
    }
}