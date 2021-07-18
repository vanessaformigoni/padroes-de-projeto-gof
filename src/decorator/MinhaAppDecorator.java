package decorator;

public class MinhaAppDecorator {

    public static void main(String args[]) {
        Arvore arvore = new ArvoreNatal();
        arvore = new Estrela(arvore);
        arvore = new Bola(arvore);
        arvore = new Bola(arvore);
        arvore = new Bola(arvore);
        arvore = new Bola(arvore);
        arvore = new Bola(arvore);
        arvore = new PiscaPisca(arvore);

        arvore.showEnfeites();
    }
}
