package Flyweight;

public class Linha extends Figura {

    public Linha() {
        super();
    }

    @Override
    public void desenha(String cor) {
        System.out.println("Figura linha " + cor);
    }
}
