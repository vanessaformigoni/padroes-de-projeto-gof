package builder;

public class FishburguerBuilder extends SanduicheBuilder {

    private Sanduiche s = new Fishburguer();

    @Override
    public void abrePao() {
        System.out.println("Abre o pao de fishburguer. ");
    }

    @Override
    public void insereIngredientes() {
        System.out.println("Insere filé de peixe. ");
    }

    @Override
    public void fechaPao() {
        System.out.println("Fecha o pão de fishbuguer. ");

    }

    @Override
    public Sanduiche getSanduiche() {
        System.out.println("Fishburguer esta pronto. !");
        return this.s;
    }
}
