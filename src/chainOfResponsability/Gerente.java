package chainOfResponsability;

public class Gerente extends TomadorDeDecisao{

    @Override
    public void aprova(Compra compra) {
        if(compra.getValor() < 1000F) {
            System.out.println("Compra aprovada pelo gerente. ");
        }
        else if (sucessor!=null) {
            sucessor.aprova(compra);
        }
    }
}
