package chainOfResponsability;

public class Diretor extends TomadorDeDecisao{

    @Override
    public void aprova(Compra compra) {
        if(compra.getValor() < 10000F) {
            System.out.println("Compra aprovada pelo diretor. ");
        }
        else if (sucessor!=null) {
            sucessor.aprova(compra);
        }
    }
}
