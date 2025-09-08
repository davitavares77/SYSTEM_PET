package app;

import model.*;
import val.Validacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);
    private static final List<Pets> ListaPets = new ArrayList<>();
    private static final List<Dono> ListaDono = new ArrayList<>();

    public static void main(String[] args) {

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

            option = sc.nextInt(); //FIXME Validação para somente int
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

        } while (option != 0);
    }

    private static void cadastrarPet() {
        System.out.println("\n--- CADASTRO DE PET ---");//FIXME Numero como nome porte e raça

        Pets pets = new Pets();

        System.out.println("\nNome do pet:");
        String nome = sc.nextLine();

        if (Validacao.validarString(nome)) {
            pets.setNome(nome);
        } else {
            System.out.println("Digite um nome valido");
        }

        System.out.println("Porte:");
        String porte = sc.nextLine();

        if (Validacao.validarString(porte)) {
            pets.setPorte(porte);
        } else {
            System.out.println("Digite um porte valido");
        }

        System.out.println("Raça:");
        String raca = sc.nextLine();

        if (Validacao.validarString(raca)) {
            pets.setRaca(raca);
        } else {
            System.out.println("Digite uma raça valida");

        }

        ListaPets.add(pets);
        System.out.println("Pet cadastrado com sucesso!");
    }

    private static void cadastrarDono() {
        System.out.println("\n--- CADASTRO DE DONO ---");//FIXME Numero como nome

        Dono dono = new Dono();

        System.out.println("\nNome do dono:");
        String nome = sc.nextLine();

        if (Validacao.validarString(nome)) {
            dono.setNome(nome);
        } else {
            System.out.println("Digite um nome valido");
        }

        System.out.println("\nTelefone para contato:");
        String telefone = sc.nextLine();

        if (Validacao.validarTelefone(telefone)) {
            dono.setTelefone(telefone);
        } else {
            System.out.println("Digite um telefone valido");
        }
        ListaDono.add(dono);
    }

    private static void listarPets() {
        System.out.println("\n=== LISTA DE PETS ===");

        if (ListaPets.isEmpty()) {
            System.out.println("Não há pets cadastrados.");
            return;
        }
        for (int i = 0; i < ListaPets.size(); i++) {
            System.out.println(i + 1);
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

    private static void deletarPets() {//XXX É obrigatorio excluir um pet, caso digite errado fica preso
        if (ListaPets.isEmpty()) {
            System.out.println("Não há pets cadastrados para remover.");
            return;
        }
        
        System.out.println("\n=== REMOÇÃO DE PETS ===");
        listarPets();
        
        int indice = Validacao.validarInteiro(sc, "Digite o número do pet que deseja remover: ", 1, ListaPets.size()) - 1;
        Pets petsRemovido = ListaPets.remove(indice);
        
        System.out.println("Pet '" + petsRemovido.getId() + "' removido com sucesso!");
    }

    private static void deletarDono() {//XXX É obrigatorio excluir um pet, caso digite errado fica preso
        if (ListaDono.isEmpty()) {
            System.out.println("Não há donos cadastrados para remover.");
            return;
        }

        System.out.println("\n=== REMOÇÃO DE DONOS ===");
        listarDonos();

        int indice = Validacao.validarInteiro(sc, "Digite o número do dono que deseja remover: ", 1, ListaDono.size())
                - 1;
        Dono donoRemovido = ListaDono.remove(indice);

        System.out.println("Dono '" + donoRemovido.getDonoId() + "' removido com sucesso!");
    }
}
