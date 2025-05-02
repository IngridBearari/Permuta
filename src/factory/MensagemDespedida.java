package src.factory;

public class MensagemDespedida implements Mensagem {
    public String formatar(String nome) {
        return "Ate logo, " + nome + "!";
    }
}
