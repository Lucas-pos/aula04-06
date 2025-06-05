public class Carro extends Veiculo {
    private int numeroDePortas;
    public Carro(String placa, String marca, int ano, int numeroDePortas) {
        super(placa, marca, ano);
        this.numeroDePortas = numeroDePortas;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    @Override
        public void exibirDados() {
            super.exibirDados();
            System.out.println("Número de portas: " + numeroDePortas);
        }
    }