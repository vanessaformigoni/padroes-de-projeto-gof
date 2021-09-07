package chainOfResponsability;
//Handler - Aprova ou repassa a responsabilidade ao sucessor.
public abstract class TomadorDeDecisao {

    protected TomadorDeDecisao sucessor;

    public void setSucessor(TomadorDeDecisao sucessor) {
        this.sucessor = sucessor;
    }

    public abstract void aprova(Compra compra);
}
