package adapter;

public class MeuAppAdapter {

    public static void main(String args[]) {

        TomadaBrasileira tomadaBrasileira = new TomadaBrasileira();

        PlugAmericano plugAmericano = new PlugAmericano();

       // tomadaBrasileira.conecta(plugAmericano);
        //da erro porque tomada brasileira só aceita plug brasileiro

        AdpterEUAtoBrasil tomadaModificada = new AdpterEUAtoBrasil();
        String s = tomadaModificada.conecta(plugAmericano);

        System.out.println(s);
    }
}
