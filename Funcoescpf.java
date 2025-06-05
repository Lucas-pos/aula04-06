package clientecpf;

import java.util.HashMap;
import java.util.Scanner;

public class Funcoescpf {

	Scanner scanner = new Scanner(System.in);
	
	public static void cadastrar(Scanner scanner1, HashMap<String, Cliente> clientes) {
		System.out.println("Digite seu nome: ");
		String nome = scanner1.nextLine();
	
		System.out.println("Digite o seu cpf: ");
		String cpf = scanner1.nextLine();

		Cliente novaCliente = new Cliente(nome, cpf);
		clientes.put(cpf, novaCliente);
		System.out.println("Novo cliente cadastrado com sucesso! ");
	}

	public static void pesquisar( HashMap<String, Cliente> clientes) {
		Cliente novaCliente = null;
		Cliente cliente = clientes.get(novaCliente.getCpf());
		System.out.println("Cliente está cadastrado ");
	}

	public static void remover(Scanner scanner2, HashMap<String, Cliente> clientes) {
		Object cpf = null;
		Cliente removerCpf = clientes.remove(cpf);
		System.out.println("Cpf removido: " + removerCpf);
	}

}