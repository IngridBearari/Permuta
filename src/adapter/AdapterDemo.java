package src.adapter;

import java.util.Scanner;

public class AdapterDemo {
    public static void executar(Scanner scanner) {
        System.out.print("Digite o valor: ");
        double valor = scanner.nextDouble();
        System.out.print("Digite o percentual de desconto: ");
        double percentual = scanner.nextDouble();

        CalculadoraDesconto calc = new DescontoAdapter();
        double resultado = calc.calcular(valor, percentual);
        System.out.printf("Valor com desconto: R$%.2f\n", resultado);
    }
}
