package factorymethod;

import java.util.Calendar;

//Procuto Concreto
public class PassagemOninusInterestadual extends Passagem{

    public PassagemOninusInterestadual(String origem, String destino, Calendar dataHoraPartida) {
        super(origem, destino, dataHoraPartida);
    }

    @Override
    public void exibeDetalhes() {
        System.out.println("Passagem de ônibus interestadual: " + this.getOrigem() +
                " para " + this.getDestino() +
                ", Data/Hora: " + super.df.format(this.getDataHoraPartida().getTime()));

    }
}
