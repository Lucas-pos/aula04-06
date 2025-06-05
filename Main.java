package clientecpf;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Cliente> clientes = new HashMap<>();
		
		int opcao;
		
		do {
			System.out.println("Temos as seguintes opções: ");
			System.out.println("1- Adicionar conta");
			System.out.println("2- Remover conta");
			System.out.println("3- Listar contas");
			System.out.println("4- Sair");
			System.out.println("Digite a operação que você quer realizar: ");
			
			opcao = scanner.nextInt();
			scanner.nextLine();
			
			switch (opcao) {
			case 1:
				 Funcoescpf.cadastrar(scanner,clientes);
				break;
			case 2:
				Funcoescpf.remover(scanner,clientes);
			//case 3:
			//	Funcoescpf.pesquisar(scanner,clientes);
			//case 4:
				
			
			default:
				break;
			}
			
		}while(opcao != 4);
	}


}