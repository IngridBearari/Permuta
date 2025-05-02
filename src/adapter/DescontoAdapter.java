package src.adapter;

public class DescontoAdapter implements CalculadoraDesconto {
    private final SistemaDescontoExterno sistema = new SistemaDescontoExterno();

    public double calcular(double valor, double percentual) {
        return sistema.aplicarDescontoPercentual(valor, percentual);
    }
}
