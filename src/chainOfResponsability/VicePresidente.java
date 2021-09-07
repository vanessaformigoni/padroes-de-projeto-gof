package chainOfResponsability;

public class VicePresidente extends TomadorDeDecisao{

    @Override
    public void aprova(Compra compra) {
        if(compra.getValor() < 30000F) {
            System.out.println("Compra aprovada pelo vice-presidente. ");
        }
        else if (sucessor!=null) {
            sucessor.aprova(compra);
        }
    }
}
