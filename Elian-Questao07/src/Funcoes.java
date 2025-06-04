import javax.swing.*;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Funcoes {

    public static String nomeDoAluno(Scanner scanner,  HashMap<String, Double> hashMap) {
        System.out.print("Digite o nome do aluno. Deixe em branco para cancelar: ");
        String nome = scanner.nextLine().strip().toLowerCase();
        if (nome.isEmpty()) {
            return null;
        }
        if (hashMap.containsKey(nome)) {
            System.out.println("Aluno ja esta cadastrado");
            return null;
        }
        return nome;
    }

    public static void adicionarAlunoEMedia(Scanner scanner, HashMap<String, Double> hashMap) {
        String nome = nomeDoAluno(scanner, hashMap);
        if (nome == null) {
            return;
        }
        double media = mediaDasNotas(scanner);
        hashMap.put(nome, media);

    }

    public static void atualizarNota(Scanner scanner, HashMap<String, Double> hashMap) {
        double media = 0;
        System.out.print("Digite o nome do aluno. Deixe em branco para cancelar: ");
        String nome = scanner.nextLine().strip().toLowerCase();
        if (nome.isEmpty()) {
            return;
        }
        if (!hashMap.containsKey(nome)) {
            System.out.println("Aluno não esta cadastrado");
            return ;
        }

        media = mediaDasNotas(scanner);
        hashMap.replace(nome, media);
        System.out.println("Nota atualizada");

    }

    public static double VerificarNumeroDouble(String texto) {
        Scanner scan = new Scanner(System.in);
        boolean controleDeLoop = true;
        double numero = 0;

        while (controleDeLoop) {
            System.out.print(texto);
            try {
                numero = scan.nextDouble();
                controleDeLoop = false;

            } catch (InputMismatchException e) {
                scan.nextLine();
                System.out.println("Entrada invalida. Digite um numero");
            }

        }
        return numero;
    }

    public static int VerificarNumeroInt(String texto) {
        Scanner scan = new Scanner(System.in);
        boolean controleDeLoop = true;
        int numero = 0;

        while (controleDeLoop) {
            System.out.print(texto);
            try {
                numero = scan.nextInt();
                controleDeLoop = false;

            } catch (InputMismatchException e) {
                scan.nextLine();
                System.out.println("Entrada invalida. Digite um numero");
            }

        }
        return numero;
    }

    public static double mediaDasNotas(Scanner scanner) {
        double soma = 0;
        double nota = 0;
        int quantidadeDeNotas = VerificarNumeroInt("Digite a quantidade de notas para calcular a media: ");
        for (int i = 1; i <= quantidadeDeNotas ; i++) {
            nota = VerificarNumeroDouble(String.format("Digite a %dº nota: ", i));
            soma += nota;

        }
        return soma / quantidadeDeNotas;
    }

    public static double mediaDaTurma( HashMap<String, Double> hashMap) {
        double soma = 0;
        for (double nota : hashMap.values()) {
            soma += nota;
        }
        return soma / hashMap.size();
    }

    public static void alunosPassados( HashMap<String, Double> hashMap) {
        for (String nome : hashMap.keySet()) {
            if (hashMap.get(nome) >= 7) {
                System.out.printf("%s : %.2f %n", nome, hashMap.get(nome));
            }
        }
    }



}
