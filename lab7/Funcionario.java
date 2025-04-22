package lab7;

import java.util.Scanner;

public class Funcionario extends PFisica{
    private int matricula;
    private double salario;
    private String cargo;

    Funcionario(int matricula, double salario, String cargo, String nome, String endereco, String telefone, String cpf, char sexo, int estadoCivil){
        super(nome, endereco, telefone, cpf, sexo, estadoCivil);
        this.matricula = matricula;
        this.cargo = cargo;
        this.salario = salario;
    }

    public int getMatricula(){
        return matricula;
    }

    public String getCargo(){
        return cargo;
    }

    public double getSalario(){
        return salario;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public String toString(){
        return super.toString() + "Dados do Funcionário:\n" + matricula + ", " + cargo + ", " + salario + "\n";
    }

    public Funcionario registraFuncionario(){
            Scanner sc = new Scanner(System.in);
        
            System.out.println("Nome:");
            String nome = sc.nextLine();
            System.out.println("Endereço:");
            String endereco = sc.nextLine();
            System.out.println("Telefone:");
            String telefone = sc.nextLine();
            System.out.println("CPF:");
            String cpf = sc.nextLine();
            System.out.println("Sexo (M/F):");
            char sexo = sc.nextLine().charAt(0);
            System.out.println("Estado civil (1-Solteiro, 2-Casado, 3-Divorciado, 4-Viúvo):");
            int estadoCivil = Integer.parseInt(sc.nextLine());
            System.out.println("Matrícula:");
            int matricula = Integer.parseInt(sc.nextLine());
            System.out.println("Salário:");
            double salario = Double.parseDouble(sc.nextLine());
            System.out.println("Cargo:");
            String cargo = sc.nextLine();
            
            System.out.println("Funcionário cadastrado com sucesso!");

            return new Funcionario(matricula, salario, cargo, nome, endereco, telefone, cpf, sexo, estadoCivil);
    }
}