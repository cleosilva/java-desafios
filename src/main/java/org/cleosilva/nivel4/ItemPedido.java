package org.cleosilva.nivel4;

import org.cleosilva.nivel1.desafio1.Produto;

public class ItemPedido {
    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto produto, int quantidade) {
        // Validação para evitar pedidos inválidos
        if (produto == null){
            throw new IllegalArgumentException("Produto não pode ser nulo.");
        }
        if (quantidade <= 0){
            throw new IllegalArgumentException("Quantidade do item deve ser maior que zero.");
        }
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getTotal(){
        return produto.preco() * quantidade;
    }

    @Override
    public String toString() {
        return "- Item: " + produto.nome() +
                "(Cod: " + produto.codigoUnico() + ")" +
                ", Qtidade: " + quantidade +
                ", Preço Unit: R$" + String.format("%.2f",produto.preco()) +
                ", Subtotal: R$ " + String.format("%.2f", getTotal());
    }
}
