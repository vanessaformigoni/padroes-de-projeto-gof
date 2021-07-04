package adapter;

public class AdpterEUAtoBrasil extends TomadaBrasileira{

    public String conecta (PlugAmericano plug) {
        return plug.obtemEletricidade() + this.getNomeRede();
    }
}
