package src.interpreter;

public class CaixaAltaExpressao implements Expressao {
    private final String texto;

    public CaixaAltaExpressao(String texto) {
        this.texto = texto;
    }

    public String interpretar() {
        StringBuilder sb = new StringBuilder();
        for (char c : texto.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                sb.append((char) (c - 32));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
