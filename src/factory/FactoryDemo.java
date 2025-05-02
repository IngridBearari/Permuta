package src.factory;

import java.util.Scanner;

public class FactoryDemo {
    public static void executar(Scanner scanner) {
        System.out.print("Digite o tipo de mensagem (boasvindas, despedida, agradecimento): ");
        String tipo = scanner.nextLine();
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        try {
            Mensagem msg = MensagemFactory.criar(tipo);
            System.out.println("Saída: " + msg.formatar(nome));
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
