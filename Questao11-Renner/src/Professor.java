public class Professor extends Pessoa {
    private String siape;
    private String disciplina;

    public Professor(String nome, String cpf, String endereco, String siape, String disciplina) {
        super(nome, cpf, endereco);
        this.siape = siape;
        this.disciplina = disciplina;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("SIAPE: " + siape);
        System.out.println("Disciplina: " + disciplina);
        System.out.println("----------------------");
    }
}