package abstracfactory;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MinhaAppAbstractFactory {

    public void main(String[] args) {

        //Empresa de onibus
        EmpresaOnibus empresaOnibus = new ConcreteEmpresaOnibus();

        //Emite passagem
        PassagemOnibusUrbano passagemUrbana = empresaOnibus.emitePassagemOnibusUrbano(
                "São Mateus", "Vitória", new GregorianCalendar
                        (2020, Calendar.JUNE,26,11,00));

        PassagemOnibusInterestadual passagemInterestadual = empresaOnibus.emitePassagemOnibusInterestadual(
                "Vitoria","São Paulo", new GregorianCalendar
                        (2020, Calendar.JUNE,26,11,00));

        //Exibe detalhes da passagem

        passagemUrbana.exibeDetalhes();
        passagemInterestadual.exibeDetalhes();

    }
}
