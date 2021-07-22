package facade;

class Facade {

    private SubsistemaUm subsistemaUm;
    private SubsistemaDois subsistemaDois;
    private SubsistemaTres subsistemaTres;

    public Facade() {
        subsistemaUm = new SubsistemaUm();
        subsistemaDois = new SubsistemaDois();
        subsistemaTres = new SubsistemaTres();
    }

    public void metodoA(){
        subsistemaUm.metodoUm(); //subsistema 1
        subsistemaDois.metodoDois(); //subsistema 2
        subsistemaTres.metodoTres(); //subsistema 3
    }

    public void metodoB(){
        subsistemaTres.metodoTres(); //subsistema 3
        subsistemaDois.metodoDois(); //subsistema 2
        subsistemaUm.metodoUm(); //subsistema 1
    }

}
