package Flyweight;

public class Oval extends Figura {

    private boolean preenchido;

    public Oval(boolean preenchido) {
        super();
        this.preenchido = preenchido;
    }

    @Override
    public void desenha(String cor) {

        if(preenchido){
            System.out.println("Figura oval preenchida " + cor);
        }
        else{
            System.out.println("Figura oval nao preenchida " + cor);
        }
    }
}
