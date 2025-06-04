import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gerente gerente = new Gerente();
        int opcao;
        do {
            System.out.println("\nO que você deseja?");
            System.out.println("_____________");
            System.out.println("1- Cadastrar produto.");
            System.out.println("2- Pesquisar produto");
            System.out.println("3- Atualizar estoque de produto");
            System.out.println("4- Listar produtos sem estoque");
            System.out.println("5- Remover produto do sistema");
            System.out.println("6- Sair");
            System.out.println("_____________");
            System.out.print("Digite o que deseja: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    gerente.cadastrarProduto(scanner);
                    break;
                case 2:
                    gerente.pesquisarProduto(scanner);
                    break;
                case 3:
                    gerente.atualizarEstoque(scanner);
                    break;
                case 4:
                    gerente.listar();
                    break;
                case 5:
                    gerente.remover(scanner);
                    break;
                case 6:
                    System.out.println("Saindo!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }while(opcao != 6);
    }
}