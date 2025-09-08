package val;

import java.util.Scanner;

public class Validacao {
    private Validacao() {
        // Private constructor to prevent instantiation
    }

    public static boolean validarString(String nome) {
        if (nome != null && !nome.isEmpty()) {
            return true;
            // valido
        } else {
            System.out.println("sem nome (nulo ou vazio)");
            // não valido
            return false;
        }

    }

    public static boolean validarTelefone(String telefone) {
        if (telefone != null && !telefone.isEmpty()) {
            return true;
        }

        else {
            System.out.println("numero de telefone invalido");
            // não valido
            return false;
        }
    }

    public static int validarInteiro(Scanner scanner, String mensagem, int min, int max) {
        int valor;
        while (true) {
            System.out.print(mensagem);
            try {
                valor = Integer.parseInt(scanner.nextLine());
                if (valor >= min && valor <= max) {
                    break;
                } else {
                    System.out.println("Por favor, digite um número entre " + min + " e " + max + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um número inteiro.");
            }
        }
        return valor;
    }

    public static int validarOpcao(Scanner scanner) {
        while (true) {
            System.out.print("Digite uma opção numérica: ");

            if (scanner.hasNextInt()) {
                int option = scanner.nextInt();
                return option; // valor válido, retorna
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                scanner.next(); // consome a entrada inválida
            }
        }
    }

}
