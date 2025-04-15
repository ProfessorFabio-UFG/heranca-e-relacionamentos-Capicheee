package lab7;
import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario[] = new Funcionario[5];
        Cliente cliente[] = new Cliente[7];
        Fornecedor fornecedor[] = new Fornecedor[3];
        
        int i = 10;
        int numFuncionarios = 0;
        int numClientes = 0;
        int numFornecedores = 0;

        while(i != 0){
            System.out.println("1 - Empregar funcionários\n2 - Demitir funcionários\n3 - Cadastrar cliente\n4 - Cadastrar fornecedor\n5 - Listar pessoa\n0 - Sair\n");
            i = Integer.parseInt(sc.nextLine());
            switch(i){
                case 1:
                    if(numFuncionarios < funcionario.length){
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
                        
                        funcionario[numFuncionarios] = new Funcionario(matricula, salario, cargo, nome, endereco, telefone, cpf, sexo, estadoCivil);
                        numFuncionarios++;
                        System.out.println("Funcionário cadastrado com sucesso!");
                    } else {
                        System.out.println("Limite de funcionários atingido!");
                    }
                    break;

                case 2:
                    System.out.println("Digite a matrícula do funcionário a ser demitido:");
                    int matriculaDemitir = Integer.parseInt(sc.nextLine());
                    boolean encontrado = false;
                    
                    for(int j = 0; j < numFuncionarios; j++){
                        if(funcionario[j].getMatricula() == matriculaDemitir){
                            encontrado = true;
                            for(int k = j; k < numFuncionarios-1; k++){
                                funcionario[k] = funcionario[k+1];
                            }
                            numFuncionarios--;
                            System.out.println("Funcionário demitido\n");
                            break;
                        }
                    }
            

                case 3:
                    if(numClientes < cliente.length){
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
                        
                        cliente[numClientes] = new Cliente(renda, interesses, profissao, nomeCliente, enderecoCliente, telefoneCliente, cpfCliente, sexoCliente, estadoCivilCliente);
                        numClientes++;
                    } else {
                        System.out.println("Cheio demais\n");
                    }
                    break;

                case 4:
                    if(numFornecedores < fornecedor.length){
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
                        
                        fornecedor[numFornecedores] = new Fornecedor(produto, nomeFornecedor, enderecoFornecedor, telefoneFornecedor, cnpj, razaoSocial);
                        numFornecedores++;
                    } else {
                        System.out.println("Cheio demais.\n");
                    }
                    break;

                case 5:
                    int opt;
                    System.out.println("Emitir (1) cliente (2) fornecedor (3) funcionário\n");
                    opt = Integer.parseInt(sc.nextLine());
                        switch(opt){
                            case 1:
                                for(int j = 0; j < numClientes; j++){
                                    System.out.println(cliente[j].toString());
                                }
                                break;

                            case 2:
                                for(int j = 0; j < numFornecedores; j++){
                                    System.out.println(fornecedor[j].toString());
                                }
                                break;

                            case 3:
                                for(int j = 0; j < numFuncionarios; j++){
                                    System.out.println(funcionario[j].toString());
                                }
                                break;
                        }
                    break;
            }
        }
        sc.close();
    }
}
