public class Produto {
    private String nome;
    private int quantidade;
    private int codigo;

    public Produto(String nome, int quantidade, int codigo) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Produto:\nnome = '" + nome + '\'' +
                "\nquantidade = " + quantidade +
                "\ncodigo = " + codigo;
    }
}