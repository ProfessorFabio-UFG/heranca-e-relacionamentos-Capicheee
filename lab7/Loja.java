package lab7;
import java.util.Scanner;

public class Loja {
    public static Funcionario funcionario[];
    public static Cliente cliente[];
    public static Fornecedor fornecedor[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        funcionario = new Funcionario[10];
        cliente = new Cliente[10];
        fornecedor = new Fornecedor[10];

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
                        Funcionario f = new Funcionario(0, 0, "", "", "", "", "", ' ', 0);
                        funcionario[numFuncionarios] = f.registraFuncionario();
                        numFuncionarios++;
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
                        Cliente c = new Cliente(0, "", "", "", "", "", "", ' ', 0);
                        cliente[numClientes] = c.registraCliente();
                        numClientes++;
                    } else {
                        System.out.println("Cheio demais\n");
                    }
                    break;

                case 4:
                    if(numFornecedores < fornecedor.length){
                        Fornecedor g = new Fornecedor(null, null, null, null, null, null);
                        fornecedor[numFornecedores] = g.registraFornecedor();
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
