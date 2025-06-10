import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        // Adicionando alunos e professores
        pessoas.add(new Aluno("João Silva", "111.222.333-44", "Rua A, 123", "2023001", "Engenharia"));
        pessoas.add(new Aluno("Maria Souza", "555.666.777-88", "Rua B, 456", "2023002", "Medicina"));
        pessoas.add(new Professor("Carlos Andrade", "999.888.777-66", "Av. C, 789", "12345", "Matemática"));
        pessoas.add(new Professor("Ana Lima", "444.333.222-11", "Av. D, 101", "54321", "História"));

        // Listando todos
        System.out.println("Todas as pessoas:");
        for (Pessoa p : pessoas) {
            p.exibirDados();
        }

        // Listando apenas alunos
        System.out.println("\nSomente alunos:");
        listarPorTipo(pessoas, "aluno");

        // Listando apenas professores
        System.out.println("\nSomente professores:");
        listarPorTipo(pessoas, "professor");
    }

    public static void listarPorTipo(ArrayList<Pessoa> pessoas, String tipo) {
        for (Pessoa p : pessoas) {
            if (tipo.equalsIgnoreCase("aluno") && p instanceof Aluno) {
                p.exibirDados();
            } else if (tipo.equalsIgnoreCase("professor") && p instanceof Professor) {
                p.exibirDados();
            }
        }
    }
}