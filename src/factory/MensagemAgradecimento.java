package src.factory;

public class MensagemAgradecimento implements Mensagem {
    public String formatar(String nome) {
        return "Obrigado, " + nome + ", por sua presença!";
    }
}
