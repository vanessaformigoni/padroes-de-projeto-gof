package mediator;

public abstract class Mediator { //Tera o objetivo de filtrar mensagens com palavras inapropriadas

    public abstract void enviaMensagem(String remetente, String destinatario, String mensagem);
}
