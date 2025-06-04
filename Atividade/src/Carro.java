public class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String placa, String marca, int ano, int numeroPortas) {
        super(placa, marca, ano);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Número de portas: " + numeroPortas);
        System.out.println("----------------------");
    }
}