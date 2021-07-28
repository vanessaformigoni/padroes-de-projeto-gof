package state;

public class Pato extends Ave {

    private Comportamento comportamentoVoar;
    private Comportamento comportamentoGrasnar;

    public Pato() {
        comportamentoVoar = new Voar();
        comportamentoGrasnar = new Grasnar();
    }

    @Override
    public void setComportamentoVoar(Comportamento c) {
        comportamentoVoar = c;
    }

    @Override
    public void voar() {
        comportamentoVoar.exec();
    }

    @Override
    public void setComportamentoGrasnar(Comportamento c) {
        comportamentoGrasnar = c;
    }

    @Override
    public void grasnar() {
        comportamentoGrasnar.exec();
    }
}
