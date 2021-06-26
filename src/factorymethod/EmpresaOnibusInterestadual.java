package factorymethod;

import java.util.Calendar;

public class EmpresaOnibusInterestadual extends Empresa{

    @Override
    public Passagem emitePassagem(String origem, String destino, Calendar dataHoraPartida) {

        return new PassagemOninusInterestadual(origem,destino,dataHoraPartida);

    }
}
