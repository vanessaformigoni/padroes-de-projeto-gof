package observer;

public class MinhaAppObserver {

    public static void main( String args[] ) {

        //Observador
        CarroPolicia carroPolicia = new CarroPolicia();

        //Observado
        CarroRoubado carroRoubado = new CarroRoubado();

        //Os observadores devem conhecer o objeto de interesse
        //Adicionar o observador ao observado.
        carroRoubado.addObserver(carroPolicia);

        carroRoubado.frente();
        carroRoubado.direita();
        carroRoubado.frente();
        carroRoubado.esquerda();
        carroRoubado.para();

    }
}
