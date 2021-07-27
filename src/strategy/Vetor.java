package strategy;

public class Vetor {

    private AlgoritmoOrdenacao algoritmo;

    public Vetor(AlgoritmoOrdenacao algoritmoOrdenacao) {
        this.algoritmo = algoritmoOrdenacao;
    }

    public void setAlgoritmo(AlgoritmoOrdenacao algoritmo) {
        this.algoritmo = algoritmo;
    }

    public void ordenar (){
        algoritmo.sort();
    }

}
