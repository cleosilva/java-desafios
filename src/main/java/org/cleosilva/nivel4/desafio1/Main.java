package org.cleosilva.nivel4.desafio1;

import org.cleosilva.nivel1.desafio1.Produto;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Obtenha a instância única do Estoque
        Estoque estoque = Estoque.getInstance();

        // Adiciona alguns itens no estoque
        estoque.adicionarProduto(new Produto("Escova Cabelo", 75.5, 100));
        estoque.adicionarProduto(new Produto("Arroz", 25, 50));
        estoque.adicionarProduto(new Produto("Feijão", 8.99, 30));
        estoque.adicionarProduto(new Produto("Café", 12.00, 20));

        System.out.println(estoque);

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Pedido pedidoAtual = null;
        int opcao = -1;

        do{
            System.out.println("\n--- Menu do Sistema de Pedidos ---");
            System.out.println("1. Criar Novo Pedido");
            System.out.println("2. Adicionar Item ao Pedido Atual");
            System.out.println("3. Exibir Detalhes do Pedido Atual");
            System.out.println("4. Exibir Estoque Atual");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = scanner.nextInt();
                scanner.nextLine(); // consumir a quebra de linha

                switch (opcao) {
                    case 1:
                        pedidoAtual = new Pedido();
                        System.out.println("Novo pedido Nº " + pedidoAtual.getIdPedido() + " criado com sucesso!");
                        break;
                    case 2:
                        if (pedidoAtual == null){
                            System.out.println("Por favor, crie um pedido primeiro");
                            break;
                        }
                        System.out.println("Digite o nome do produto: ");
                        String nomeDoProduto = scanner.nextLine();
                        System.out.println("Digite a quantidade do produto");
                        int quantidade = scanner.nextInt();
                        scanner.nextLine(); // consumir a quebra de linha

                        try {
                            // Obter o produto no estoque para adicionar
                            Produto produtoParaAdicionar = estoque.getProduto(nomeDoProduto);
                            if(produtoParaAdicionar == null){
                                System.out.println("Produto " + nomeDoProduto + " não encontrado no estoque");
                            } else {
                                pedidoAtual.adicionarItem(produtoParaAdicionar, quantidade);
                            }
                        } catch (EstoqueInsuficienteException e){
                            System.out.println("Erro ao adicionar item: " + e.getMessage());
                        } catch (IllegalArgumentException e) {
                            System.out.println("Erro: " + e.getMessage());
                        }
                        break;
                    case 3:
                        if (pedidoAtual == null) {
                            System.out.println("Nenhum pedido ativo para exibir.");
                        } else {
                            pedidoAtual.exibirDetalhes();
                        }
                        break;
                    case 4:
                        System.out.println(estoque);
                        break;
                    case 0:
                        System.out.println("Saindo do sistema. Obrigada!");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente");
                }
            }catch (InputMismatchException e){
                System.out.println("Entrada inválida. Por favor digite um número para a opção");
                scanner.nextLine(); // Consumir a entrada inválida para evitar loop infinito
                opcao = -1; // Resetar opção para continuar o loop
            }catch (Exception e){
                System.out.println("Ocorreu um erro inesperado. " + e.getMessage());
                e.printStackTrace();
            }
        } while (opcao != 0);

        scanner.close();
    }
}
