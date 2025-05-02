package src.factory;

public class MensagemDespedida implements Mensagem {
    public String formatar(String nome) {
        return "Até logo, " + nome + "!";
    }
}
