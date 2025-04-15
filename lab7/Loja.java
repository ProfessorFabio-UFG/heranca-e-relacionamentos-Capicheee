package lab7;
import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario[] = new Funcionario[5];
        Cliente cliente[] = new Cliente[7];
        Fornecedor fornecedor[] = new Fornecedor[3];
        
        int i = 10;

        while(i != 0){
            System.out.println("1 - Empregar funcionários\n2 - Demitir funcionários\n3 - Cadastrar cliente\n4 - Cadastrar fornecedor\n5 - Listar pessoa\n0 - Sair\n");
            i = Integer.parseInt(sc.nextLine());
            switch(i){
                case 1:

                break;

                case 2:

                break;

                case 3:

                break;

                case 4:

                break;

                case 5:
                    int opt;
                    System.out.println("Emitir (1) cliente (2) fornecedor (3) funcionário\n");
                    opt = Integer.parseInt(sc.nextLine());
                        switch(opt){
                            case 1:

                            break;

                            case 2:

                            break;

                            case 3:

                            break;
                        }
                break;
            }
        }
        sc.close();
    }
}
