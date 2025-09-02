package App;

import model.*;
import val.Validacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private static final Scanner sc = new Scanner(System.in);

    private static final List<Pets> ListaPets = new ArrayList<>();
    private static final List<Dono> ListaDono = new ArrayList<>();

    public static void Main(String[] args) {

        int option;

        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1 - Cadastrar Pet");
            System.out.println("2 - Cadastrar Dono");
            System.out.println("3 - Listar Pets");
            System.out.println("4 - Listar donos");
            System.out.println("5 - Deletar Pet");
            System.out.println("6 - Deletar Dono");
            System.out.println("0 - Sair");
            System.out.println("========================");

            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    cadastrarPet();
                    break;

                case 2:
                    cadastrarDono();
                    break;

                case 3:
                    listarPets();
                    break;

                case 4:
                    listarDonos();
                    break;

                case 5:
                    deletarPets();
                    break;

                case 6:
                    deletarDono();
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (option != 3);
    }

    private static void cadastrarPet() {
        System.out.println("\n--- CADASTRO DE PET ---");

        Pets pets = new Pets();

        String nome = sc.nextLine();

        if (Validacao.validarString(nome)) {
            pets.setNome(nome);
        } else {
            System.out.println("Digite um nome valido");
        }

        String porte = sc.nextLine();

        if (Validacao.validarString(porte)) {
            pets.setPorte(porte);
        } else {
            System.out.println("Digite um porte valido");
        }

        String raca = sc.nextLine();

        if (Validacao.validarString(raca)) {
            pets.setRaca(raca);
        } else {
            System.out.println("Digite uma raça valida");
        }

    }

    private static void cadastrarDono() {
        System.out.println("\n--- CADASTRO DE DONO ---");

        Dono dono = new Dono();

        String nome = sc.nextLine();

        if (Validacao.validarString(nome)) {
            dono.setNome(nome);
        } else {
            System.out.println("Digite um nome valido");
        }

        String telefone = sc.nextLine();

        if (Validacao.validarTelefone(telefone)) {
            dono.setTelefone(telefone);
        } else {
            System.out.println("Digite um porte valido");
        }
    }

    private static void listarPets() {
        System.out.println("\n=== LISTA DE PETS ===");
        if (ListaPets.isEmpty()) {
            System.out.println("Não há pets cadastrados.");
            return;
        }
        for (Pets pet : ListaPets) {
            System.out.println(pet);
        }
    }

    private static void listarDonos() {
        System.out.println("\n=== LISTA DE DONOS ===");
        if (ListaDono.isEmpty()) {
            System.out.println("Não há donos cadastrados.");
            return;
        }
        for (Dono dono : ListaDono) {
            System.out.println(dono);
        }
    }

    private static void deletarPets(){
        System.out.println("=== Deletar Pets ===");
        Pets pet = ListaPets();
        if (ListaPets.isEmpty()) {
            System.out.println("Nenhum pet cadastrado");
            return;
    
        }
    }

        private static Pets ListaPets() {
        throw new UnsupportedOperationException("Unimplemented method 'ListaPets'");
    }

        private static void deletarDono(){
        System.out.println("=== Deletar Dono ===");
        Dono dono = ListaDono();
        if (ListaPets.isEmpty()) {
            System.out.println("Nenhum Dono cadastrado");
            return;
    
        }
    }

        private static Dono ListaDono() {
            throw new UnsupportedOperationException("Unimplemented method 'ListaDono'");
        }
}
