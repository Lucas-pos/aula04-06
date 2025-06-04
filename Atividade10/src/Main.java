import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Veiculo> veiculos = new ArrayList<>();

        // lista pra adicionar veiculos yupi
        veiculos.add(new Carro("ABC1234", "Ford", 2020, 4));
        veiculos.add(new Moto("XYZ9876", "Honda", 2021, 150));
        veiculos.add(new Carro("DEF5678", "Chevrolet", 2019, 2));
        veiculos.add(new Moto("MNO4321", "Yamaha", 2022, 300));

        exibirTodosVeiculos(veiculos);
    }

    // Metodo para exibir todos os veículos cadastrados
    public static void exibirTodosVeiculos(ArrayList<Veiculo> veiculos) {
        System.out.println("\n=== LISTA DE VEÍCULOS CADASTRADOS ===");
        for (Veiculo veiculo : veiculos) {
            veiculo.exibirDetalhes();
        }
    }
}