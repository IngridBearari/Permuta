package src;

import java.util.Scanner;
import src.interpreter.InterpreterDemo;
import src.factory.FactoryDemo;
import src.adapter.AdapterDemo;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Editor de Texto (Interpreter)");
            System.out.println("2 - Gerador de Mensagens (Factory Method)");
            System.out.println("3 - Sistema de Desconto (Adapter)");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> InterpreterDemo.executar(scanner);
                case 2 -> FactoryDemo.executar(scanner);
                case 3 -> AdapterDemo.executar(scanner);
            }
        } while (opcao != 0);

        scanner.close();
    }
}
