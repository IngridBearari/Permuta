package src.factory;

public class MensagemFactory {
    public static Mensagem criar(String tipo) {
        return switch (tipo.toLowerCase()) {
            case "boasvindas" -> new MensagemBoasVindas();
            case "despedida" -> new MensagemDespedida();
            case "agradecimento" -> new MensagemAgradecimento();
            default -> throw new IllegalArgumentException("Tipo inválido de mensagem");
        };
    }
}
