public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String placa, String marca, int ano, int cilindradas) {
        super(placa, marca, ano);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cilindradas: " + cilindradas);
    }
}