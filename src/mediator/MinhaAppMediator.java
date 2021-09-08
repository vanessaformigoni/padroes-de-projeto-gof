package mediator;

public class MinhaAppMediator {

    public static void main(String[] args) {
        //Cria-se o objeto Mediator
        ChatMediator salaChat = new ChatMediator();

        //Cria-se os objetos Participantes
        Participante joao = new ParticipanteImpl("Joao", salaChat);
        Participante maria = new ParticipanteImpl("Maria", salaChat);
        Participante carlos = new ParticipanteImpl("Carlos", salaChat);
        Participante renato = new ParticipanteImpl("Renato", salaChat);

        //Registra todos os participantes na sala de chat
        salaChat.registraParticipante(joao);
        salaChat.registraParticipante(maria);
        salaChat.registraParticipante(carlos);
        salaChat.registraParticipante(renato);

        //Inicia a conversa entre os participantes
        joao.enviaMensagem("Maria", "Ola Maria, tudo bem ?");

        maria.enviaMensagem("Joao", "Oi tudo! E com voce ?");

        carlos.enviaMensagem("Renato", "Renato, voce e um @!xxx.");

        joao.enviaMensagem("Maria", "Voce esta no trabalho agora ?");
    }
}
