package org.cleosilva.nivel4;

import org.cleosilva.nivel1.desafio1.Produto;

import java.util.HashMap;
import java.util.Map;

public final class Estoque {
    private static Estoque instance;
    Map<String , Produto> produtoMap = new HashMap<>();

    // Construtor privado para garantir que apenas getInstance() possa criar instâncias
    private Estoque(){
        this.produtoMap = new HashMap<>();
    }

    public static Estoque getInstance(){
        if (instance == null) {
            instance = new Estoque();
        }
        return instance;
    }

    public void adicionarProduto(Produto produto){
        if (produto != null){
            produtoMap.put(produto.nome().toLowerCase(), produto);
            System.out.println("Produto '" + produto.nome()
                    + "' adicionado/atualizado no estoque com "
                    + produto.quantidadeEmEstoque() + " unidades.");
        } else {
            System.out.println("Produto não está cadastrado");
        }
    }

    public void reduzirEstoque(String nomeProduto, int quantidade){
        Produto produtoNoEstoque = produtoMap.get(nomeProduto.toLowerCase());
        if (produtoNoEstoque == null){
            throw new IllegalArgumentException("Produto '" + nomeProduto + "' não encontrado no estoque.");
        }
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade a reduzir deve ser maior que zero.");
        }
        if (quantidade > produtoNoEstoque.quantidadeEmEstoque()){
            throw new EstoqueInsuficienteException(
                    "Estoque insuficiente para '" + nomeProduto + "'. Disponível: " +
                    produtoNoEstoque.quantidadeEmEstoque() + ", Solicitado: " + quantidade
            );
        }
        int novaQuantidade = produtoNoEstoque.quantidadeEmEstoque() - quantidade;
        Produto produtoAtualizado = produtoNoEstoque.comNovaQuantidade(novaQuantidade);
        produtoMap.put(nomeProduto.toLowerCase(), produtoAtualizado);
        System.out.println(
                "Estoque de '" + nomeProduto + "' reduzido em "
                        + quantidade + " unidades. Novo estoque: " + novaQuantidade);
    }

    public int getQuantidade(String nomeProduto){
        Produto produto = produtoMap.get(nomeProduto.toLowerCase());
        if(produto == null){
            throw  new IllegalArgumentException(
                    "Produto '" + nomeProduto + "' não encontrado no estoque.");
        }
        return produto.quantidadeEmEstoque();
    }

    public Produto getProduto(String nomeProduto){
        return produtoMap.get(nomeProduto.toLowerCase());
    }

    @Override
    public String toString() {
        if (produtoMap.isEmpty()) {
            return "Estoque: Vazio.";
        }
        StringBuilder sb = new StringBuilder("Estoque Atual:\n");
        for (Produto p : produtoMap.values()) {
            sb.append("  - ").append(p.nome())
                    .append(" (Cód: ").append(p.codigoUnico())
                    .append("), Preço: R$").append(String.format("%.2f", p.preco()))
                    .append(", Qtd: ").append(p.quantidadeEmEstoque()).append("\n");
        }
        return sb.toString();
    }
}
