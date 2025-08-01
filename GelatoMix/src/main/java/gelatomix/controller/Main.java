package gelatomix.controller;


import gelatomix.model.decorator.*;
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
            System.out.println("1 - Banana");
            System.out.println("2 - Banana SplitCombo");
            System.out.println("3 - Pedaços de Brownie");
            System.out.println("4 - Calda de Caramelo");
            System.out.println("5 - Calda de Chocolate");
            System.out.println("6 - Calda de Chocolate Branco");
            System.out.println("7 - Calda de Doce de Leite");
            System.out.println("8 - Calda de Morango");
            System.out.println("9 - Cereja");
            System.out.println("10 - Chantilly");
            System.out.println("11 - Chocaball");
            System.out.println("12 - Confete");
            System.out.println("13 - Cookies");
            System.out.println("14 - Farofa de Castanha");
            System.out.println("15 - Leite Ninho");
            System.out.println("16 - Merengue de Doce de Leite");
            System.out.println("17 - Pedaços de Morango");
            System.out.println("18 - Nutella");
            System.out.println("19 - Oreo");
            System.out.println("20 - Ovomaltine");
            System.out.println("21 - Paçoca");
            System.out.println("22 - Pistache");
            System.out.println("23 - Suspiro");
            System.out.println("24 - Uva");
            System.out.println("4 - Finalizar complementos");
            System.out.print("Opção: ");
            int comp = scanner.nextInt();
            scanner.nextLine();

            switch (comp) {
                case 1 -> base = new Banana(base);
                case 2 -> base = new BananaSplitCombo(base);
                case 3 -> base = new Brownie(base);
                case 4 -> base = new CaldaCaramelo(base);
                case 5 -> base = new CaldaChocolate(base);
                case 6 -> base = new CaldaChocolateBranco(base);
                case 7 -> base = new CaldaDoceDeLeite(base);
                case 8 -> base = new CaldaMorango(base);
                case 9 -> base = new Cereja(base);
                case 10 -> base = new Chantilly(base);
                case 11 -> base = new ChocoBall(base);
                case 12 -> base = new Confete(base);
                case 13 -> base = new Cookie(base);
                case 14 -> base = new FarofaCastanha(base);
                case 15 -> base = new LeiteNinho(base);
                case 16 -> base = new MerengueDoceLeite(base);
                case 17 -> base = new Morango(base);
                case 18 -> base = new Nutella(base);
                case 19 -> base = new Oreo(base);
                case 20 -> base = new Ovomaltine(base);
                case 21 -> base = new Pacoca(base);
                case 22 -> base = new Pipoca(base);
                case 23 -> base = new Pistache(base);
                case 24 -> base = new Suspiro(base);
                case 25 -> base = new Uva(base);
                case 26 -> continuar = false;
                default -> System.out.println("❌ Opção inválida.");
            }
        }

        return base;
    }
}
