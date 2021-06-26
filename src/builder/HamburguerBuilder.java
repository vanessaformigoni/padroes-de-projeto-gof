package builder;

public class HamburguerBuilder extends SanduicheBuilder {

    private Sanduiche s = new Hamburguer();

    public void abrePao() {
        System.out.println("Abre o pao de hambuberguer. ");
    }

    public void insereIngredientes() {
        System.out.println("Insere carne e queijo. ");
    }

    public void fechaPao() {
        System.out.println("Fecha o pao de hamburguer. ");
    }

    public Sanduiche getSanduiche() {
        System.out.println("Hambuguer esta pronto !");
        return this.s;
    }
}
