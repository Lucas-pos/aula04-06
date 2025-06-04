import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Gerente {
    HashMap<Integer, Produto> produtos;
    //HashMap<String, Produto> pesquisas;
    public Gerente() {
        this.produtos = new HashMap<>();
        //this.pesquisas = new HashMap<>();
    }

    void cadastrarProduto(Scanner scanner){
        int codigo = produtos.size() + 1001;
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a quantidade de tal produto a ser cadastrado: ");
        int quantidade = scanner.nextInt();
        Produto produto = new Produto(nome, quantidade, codigo);
        produtos.put(codigo, produto);
        //pesquisas.put(nome, produto);
        System.out.println("Cadastrado com sucesso!");
    }
    void pesquisarProduto(Scanner scanner) {
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();
//        if (pesquisas.containsKey(nome)){
//            Produto produto = pesquisas.get(nome);
//            System.out.println(produto.toString());
//        }
        boolean temNome = false;
        for (Produto produto : produtos.values()){
            if (nome.equals(produto.getNome())){
                temNome = true;
                System.out.println(produto.toString());
            }
        }
        if (!temNome) {
            System.out.println("Este produto não está cadastrado!");
        }
    }
    void atualizarEstoque(Scanner scanner){
        System.out.print("Digite o código do produto: ");
        int codigoAtualizar = scanner.nextInt();
        if (produtos.containsKey(codigoAtualizar)){
            Produto produto = produtos.get(codigoAtualizar);
            System.out.println("Produto: " + produto.getNome());
            System.out.print("Digite a quantidade atual do produto: ");
            int novaQuantidade = scanner.nextInt();
            produto.setQuantidade(novaQuantidade);
            System.out.println("Estoque atualizado com sucesso!"); //faltaria validação para número negativo
        }
        else {
            System.out.println("Produto não encontrado. código inválido!");
        }
    }
    void listar() {
        int indice = 0;
        if (produtos.size() > 0) {
            for (Produto produto : produtos.values()) {
                indice++;
                System.out.print(indice + "° ");
                System.out.println(produto.toString());
                System.out.println("______");
            }
        } else {
            System.out.println("A operação não é possível. A lista está vazia!");
        }
    }
    void remover(Scanner scanner){
        System.out.print("Digite o código do produto a ser removido: ");
        int codigoRemover = scanner.nextInt();
        if (produtos.containsKey(codigoRemover)){
            produtos.remove(codigoRemover);
            System.out.println("Produto removido com sucesso!");
        }
        else {
            System.out.println("Produto não encontrado. código inválido!");
        }
    }
}