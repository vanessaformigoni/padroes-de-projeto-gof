package state;

public class MinhaAppState {

    public static void main(String[] args) {
        Pato p = new Pato();

        p.voar();
        p.grasnar();

        //Altera o comportamento de voar
        p.setComportamentoVoar(new NaoVoar());

        p.voar();
        p.grasnar();
    }
}
