package factorymethod;

import java.text.SimpleDateFormat;
import java.util.Calendar;

//Produto abstrato
public abstract class Passagem {

    private String origem;
    private String destino;
    private Calendar dataHoraPartida;

    //Formatador de data
    protected SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    public Passagem (String origem, String destino, Calendar dataHoraPartida) {
        this.origem = origem;
        this.destino = destino;
        this.dataHoraPartida = dataHoraPartida;
    }

    public String getOrigem() { //ja poderia usar o padrao de projeto builder, mas quero seguir da forma do curso
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Calendar getDataHoraPartida() {
        return dataHoraPartida;
    }

    public void setDataHoraPartida(Calendar dataHoraPartida) {
        this.dataHoraPartida = dataHoraPartida;
    }

    public abstract void exibeDetalhes();
}
