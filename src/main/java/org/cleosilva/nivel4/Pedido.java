package org.cleosilva.nivel4;

import org.cleosilva.nivel1.desafio1.Produto;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private static long proximoIdPedido = 1; // contador estático e sequencial - requisito desafio
    private long idPedido;
    private List<ItemPedido> itensDoPedido;

    public Pedido() {
        this.idPedido = proximoIdPedido;
        this.itensDoPedido = new ArrayList<>();
    }

    public long getIdPedido() {
        return idPedido;
    }

    public void adicionarItem(Produto produto, int quantidade){
        // Validações básicas antes de interagir com estoque
        if (produto == null){
               throw new IllegalArgumentException("Não é possível adicionar um item com produto não cadastrado.");
        }
        if (quantidade <= 0){
            throw new IllegalArgumentException("Quantidade do item deve ser maior que zero.");

        }
        // Tenta reduzir o estoque. Se houver estoque insuficiente, Estoque lançara a exceção.
        // Pedido confia no Estoque para gerenciar a quantidade
        Estoque.getInstance().reduzirEstoque(produto.nome(), quantidade);

        // Se a redução no estoque for bem-sucedida, adiciona o item ao pedido.
        ItemPedido itemPedido = new ItemPedido(produto, quantidade);
        itensDoPedido.add(itemPedido);
        System.out.println(
                "Item '" + produto.nome() + "' (qtd: " + quantidade + ") adicionado ao pedido "
                        + idPedido);
    }

    public double calcularTotal(){
        double totalGeral = 0;
        for (ItemPedido item : itensDoPedido){
            totalGeral += item.getTotal();
        }
        return totalGeral;
    }

    public void exibirDetalhes() {
        System.out.println("\n--- Detalhes do Pedido Nº " + idPedido + " ---");
        if (itensDoPedido.isEmpty()) {
            System.out.println("  Nenhum item neste pedido.");
            return;
        }
        for (ItemPedido item : itensDoPedido) {
            System.out.println(item); // Usa o toString() de ItemPedido
        }
        System.out.println("------------------------------------");
        System.out.println("  Total Geral do Pedido: R$" + String.format("%.2f", calcularTotal()));
        System.out.println("------------------------------------");
    }
}




