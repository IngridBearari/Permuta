package src.factory;

public class MensagemBoasVindas implements Mensagem {
    public String formatar(String nome) {
        return "Bem-vindo, " + nome + "!";
    }
}
