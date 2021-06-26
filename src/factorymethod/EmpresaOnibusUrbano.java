package factorymethod;

import java.util.Calendar;

//Fabrica Concreta
public class EmpresaOnibusUrbano extends Empresa {

    @Override
    public Passagem emitePassagem(String origem, String destino, Calendar dataHoraPartida) {

        return new PassagemOnibusUrbano(origem,destino,dataHoraPartida);

    }
}
