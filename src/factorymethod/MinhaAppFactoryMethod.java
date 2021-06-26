package factorymethod;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MinhaAppFactoryMethod {

    public static void main(String[] args) {
        //Empresas de onibud
        EmpresaOnibusUrbano empresaOnibusUrbano = new EmpresaOnibusUrbano();

        EmpresaOnibusInterestadual empresaOnibusInterestadual = new EmpresaOnibusInterestadual();

        //Emite Passagem
        Passagem passagemUrbana = empresaOnibusUrbano.emitePassagem
                ("São Mateus", "Vitória", new GregorianCalendar
                        (2020, Calendar.JUNE,26,11,00));

        Passagem passagemInterestadual = empresaOnibusInterestadual.emitePassagem(
                "Vitoria","São Paulo", new GregorianCalendar
                        (2020, Calendar.JUNE,26,11,00));

        passagemUrbana.exibeDetalhes();
        passagemInterestadual.exibeDetalhes();

    }
}
