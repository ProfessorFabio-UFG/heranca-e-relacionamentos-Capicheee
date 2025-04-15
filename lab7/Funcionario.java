package lab7;

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
}