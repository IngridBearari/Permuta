package src.interpreter;

import java.util.Scanner;

public class InterpreterDemo {
    public static void executar(Scanner scanner) {
        System.out.print("Digite o comando: ");
        String comando = scanner.nextLine();

        if (comando.startsWith("caixa_alta(\"")) {
            String conteudo = comando.substring(11, comando.length() - 2);
            Expressao exp = new CaixaAltaExpressao(conteudo);
            System.out.println("Saída: " + exp.interpretar());
        } else if (comando.startsWith("repetir(")) {
            String inner = comando.substring(8, comando.length() - 1);
            String[] partes = inner.split(",", 2);
            int n = Integer.parseInt(partes[0].trim());
            String conteudo = partes[1].replace("\"", "").trim();
            Expressao exp = new RepetirExpressao(n, conteudo);
            System.out.println("Saída: " + exp.interpretar());
        } else {
            System.out.println("Comando inválido!");
        }
    }
}
