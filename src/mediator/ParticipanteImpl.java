package mediator;

public class ParticipanteImpl extends Participante{

    public ParticipanteImpl(String nome, Mediator mediador) {
        super(nome, mediador);
    }

    @Override
    public void enviaMensagem(String destinatario, String mensagem) {
        Mediator mediador = this.getMediador();
        mediador.enviaMensagem(this.getNome(), destinatario, mensagem);
    }

    @Override
    public void recebeMensagem(String remetente, String mensagem) {
        System.out.println(remetente + " escreveu: " + mensagem);
    }
}
