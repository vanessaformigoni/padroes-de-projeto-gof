package chainOfResponsability;

public class MinhaAppChainOfResponsability {

    public static void main(String agrs[]) {

        //Tomadores de decição
        TomadorDeDecisao presidente = new Presidente();
        TomadorDeDecisao vicePresidente = new VicePresidente();
        TomadorDeDecisao diretor = new Diretor();
        TomadorDeDecisao gerente = new Gerente();

        gerente.setSucessor(diretor);
        diretor.setSucessor(vicePresidente);
        vicePresidente.setSucessor(presidente);

        Compra compra = new Compra(20000F);
        gerente.aprova(compra);

    }
}
