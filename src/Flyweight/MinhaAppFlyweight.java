package Flyweight;

public class MinhaAppFlyweight {

    public static void main(String[] args) {

        Figura f = FiguraFactory.getFigura("linha");
        f.desenha("amarela");

        f = FiguraFactory.getFigura("oval preenchida");
        f.desenha("vermelha");
    }

}
