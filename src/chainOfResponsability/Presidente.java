package chainOfResponsability;

public class Presidente extends TomadorDeDecisao{

    @Override
    public void aprova(Compra compra) {
        if(compra.getValor() < 100000F) {
            System.out.println("Compra aprovada pelo presidente. ");
        }
        else  {
            System.out.println("Compra não aprovada. ");
        }
    }
}
