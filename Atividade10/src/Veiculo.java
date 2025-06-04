public class Veiculo {
    protected String placa;
    protected String marca;
    protected int ano;

    public Veiculo(String placa, String marca, int ano) {
        this.placa = placa;
        this.marca = marca;
        this.ano = ano;
    }

    public void exibirDetalhes() {
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
    }
}