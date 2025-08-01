package gelatomix.controller;


import gelatomix.model.decorator.Banana;
import gelatomix.model.decorator.CaldaChocolate;
import gelatomix.model.decorator.Ovomaltine;
import gelatomix.model.facade.GelatomixFacade;
import gelatomix.model.factory.*;
import gelatomix.model.interfaces.Sorvetes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GelatomixFacade facade = new GelatomixFacade();

        int opcao;
        do {
            System.out.println("\n🍦 Bem-vindo à Gelatomix!");
            System.out.println("1 - Fazer novo pedido");
            System.out.println("2 - Mostrar histórico de pedidos");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    Sorvetes sorvete = escolherSorvete(scanner);
                    if (sorvete == null) {
                        System.out.println("❌ Opção inválida.");
                        break;
                    }

                    sorvete = adicionarComplementos(scanner, sorvete);

                    facade.fazerPedido(sorvete);

                    System.out.println("\n✅ Pedido realizado com sucesso!");
                    System.out.println("👉 Descrição: " + sorvete.getDescricao());
                    System.out.printf("💰 Total a pagar: R$ %.2f%n", sorvete.getPreco());
                }

                case 2 -> {
                    facade.mostrarHistorico();
                }

                case 3 -> System.out.println("👋 Saindo...");
                default -> System.out.println("❌ Opção inválida.");
            }

        } while (opcao != 3);
    }

    private static Sorvetes escolherSorvete(Scanner scanner) {
        System.out.println("\nEscolha o seu sorvete:");
        System.out.println("1 - Bola de Sorvete sabor Chocolate");
        System.out.println("2 - Bola de Sorvete sabor Morango");
        System.out.println("3 - Picolé de Chocolate");
        System.out.println("4 - Milk Shake sabor Menta");
        System.out.println("5 - Milk Shake sabor Chocolate");
        System.out.print("Opção: ");
        int sabor = scanner.nextInt();

        return switch (sabor) {
            case 1 -> new FactoryMassaChocolate().criarSorvete();
            case 2 -> new FactoryMassaMorango().criarSorvete();
            case 3 -> new FactoryPicoleChocolate().criarSorvete();
            case 4 -> new FactoryMilkshakeMenta().criarSorvete();
            case 5 -> new FactoryMilkshakeChocolate().criarSorvete();
            default -> null;
        };
    }

    private static Sorvetes adicionarComplementos(Scanner scanner, Sorvetes base) {
        String resposta;
        do {
            System.out.print("Deseja adicionar complementos? (s/n): ");
            resposta = scanner.nextLine().trim().toLowerCase();
        } while (!resposta.equals("s") && !resposta.equals("n"));

        if (resposta.equals("n")) return base;

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nEscolha um complemento:");
            System.out.println("1 - Calda de Chocolate");
            System.out.println("2 - Banana");
            System.out.println("3 - Ovomaltine");
            System.out.println("4 - Finalizar complementos");
            System.out.print("Opção: ");
            int comp = scanner.nextInt();
            scanner.nextLine();

            switch (comp) {
                case 1 -> base = new CaldaChocolate(base);
                case 2 -> base = new Banana(base);
                case 3 -> base = new Ovomaltine(base);
                case 4 -> continuar = false;
                default -> System.out.println("❌ Opção inválida.");
            }
        }

        return base;
    }
}
