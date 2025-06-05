public class Veiculo {
    private String placa;
    private String marca;
    private int ano;

    public Veiculo(String placa, String marca, int ano) {
        this.placa = placa;
        this.marca = marca;
        this.ano = ano;
    }
    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }
    public int getAno() {
        return ano;
    }
    public void exibirDados() {
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
    }
}
