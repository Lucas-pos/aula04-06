import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    /*Questão 7 – Sistema de Notas de Alunos

Você está criando um sistema de lançamento de notas. Use um HashMap<String, Double> para armazenar a nota final de cada aluno, onde a chave é o nome do aluno.

Crie métodos para:
· Adicionar ou atualizar a nota de um aluno.
· Verificar se um aluno está cadastrado.
· Calcular a média geral da turma.
· Listar todos os alunos com nota acima de 7.0.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Double> notasDosAlunos = new HashMap<>();
        String menu = """
                1) Adicionar aluno e nota
                2) Atualizar nota
                3) Verificar aluno
                4) calcular media da turma
                5) Listar alunos com media maior que 7
                6) Sair
                """;

        int opcao = -1;
        while (opcao != 6) {
            System.out.println(menu);
            opcao = Funcoes.VerificarNumeroInt("Digite a opcao: ");

            switch (opcao) {
                case 1:
                    Funcoes.adicionarAlunoEMedia(scanner, notasDosAlunos);
                    break;
                case 2:
                    if (notasDosAlunos.isEmpty()) {
                        System.out.println("Não há alunos cadastrados");
                        break;
                    } else {
                        Funcoes.atualizarNota(scanner, notasDosAlunos);
                    }

                    break;

                case 3:
                    if (notasDosAlunos.isEmpty()) {
                        System.out.println("Não há alunos cadastrados");
                        break;
                    } else {
                        String nomePesquisado = Funcoes.nomeDoAluno(scanner, notasDosAlunos);
                        if (nomePesquisado != null) {
                            System.out.printf("Aluno encontrado, possui media: %.2f %n", notasDosAlunos.get(nomePesquisado));
                        }
                    }
                    break;


                case 4:

                    if (notasDosAlunos.isEmpty()) {
                        System.out.println("Não há alunos cadastrados");
                        break;
                    } else {
                        double media = Funcoes.mediaDaTurma(notasDosAlunos);
                        System.out.printf("Media da turma com %d alunos é %.2f %n", notasDosAlunos.size(), media);
                    }
                    break;

                case 5:
                    if (notasDosAlunos.isEmpty()) {
                        System.out.println("Não há alunos cadastrados");
                        break;
                    } else {
                        Funcoes.alunosPassados(notasDosAlunos);
                    }
                    break;

                case 6:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opcao invalida");

            }
        }



    }
}
