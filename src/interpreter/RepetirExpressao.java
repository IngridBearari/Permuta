package src.interpreter;

public class RepetirExpressao implements Expressao {
    private final int vezes;
    private final String texto;

    public RepetirExpressao(int vezes, String texto) {
        this.vezes = vezes;
        this.texto = texto;
    }

    public String interpretar() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < vezes; i++) {
            sb.append(texto);
        }
        return sb.toString();
    }
}
