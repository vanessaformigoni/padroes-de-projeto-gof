package abstracfactory;

import java.util.Calendar;

public abstract class EmpresaOnibus { //Uma única fabrica pra dois metodos distintos

    public abstract PassagemOnibusUrbano emitePassagemOnibusUrbano(String origem, String destino, Calendar dataHoraPartida);

    public abstract PassagemOnibusInterestadual emitePassagemOnibusInterestadual(String origem, String destino, Calendar dataHoraPartida);
}
