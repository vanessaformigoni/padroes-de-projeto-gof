package mediator;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

//Representa a sala de Chat
public class ChatMediator extends Mediator {

    private Hashtable<String, Participante> participantes = new Hashtable<String, Participante>();

    private List<String> palavrasProibidas = new ArrayList<String>();

    public ChatMediator() {
        //Carrega a lista de palavras proibidas na sala de chat.
        palavrasProibidas.add("xxxxx");
        palavrasProibidas.add("@!xxx");
        palavrasProibidas.add("###@!");
    }

    public void registraParticipante(Participante p) {
        //Verifica se nao existem dois participantes com o mesmo apelido na sala de chat.
        if (!participantes.containsKey(p.getNome())) {
            participantes.put(p.getNome(), p);
        } else {
            System.out.println("Usuario ja cadastrado.");
        }
    }


    @Override
    public void enviaMensagem(String remetente, String destinatario, String mensagem) {
        //Verifica se o remetente e o destinatario estao na sala de chat.
        if (participantes.containsKey(remetente) && participantes.containsKey(destinatario)) {
            //Obtem o usuario remetente
            Participante pRemetente = participantes.get(remetente);
            //Obtem o usuario destinatario
            Participante pDestinatario = participantes.get(destinatario);

            //Verifica se a mensagem contem palavras proibidas.
            for (String proibido : palavrasProibidas) {
                if (mensagem.contains(proibido)) {
                    pRemetente.recebeMensagem("Mediador", "Voce escreveu uma mensagem contendo palavras impraprias.");
                    return;
                }
            }

            //Se nao ha palavras proibidas na mensagem, entao ela eh enviada ao destinatario
            pDestinatario.recebeMensagem(remetente, mensagem);
        }
    }
}
