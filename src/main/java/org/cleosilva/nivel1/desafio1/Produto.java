package org.cleosilva.nivel1.desafio1;

import java.util.UUID;

public record Produto(String nome, double preco, int quantidadeEmEstoque, String codigoUnico) {

    public Produto {
        if(preco < 0){
            throw new IllegalArgumentException("Preço não pode ser negativo");
        }
        if (quantidadeEmEstoque < 0){
            throw new IllegalArgumentException("Quantidade em estoque não pode ser menor que 0");
        }
    }

    public Produto(String nome, double preco) {
        this(nome, preco, 0, UUID.randomUUID().toString());
    }

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this(nome, preco, quantidadeEmEstoque, UUID.randomUUID().toString());
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidadeEmEstoque=" + quantidadeEmEstoque +
                ", codigoUnico='" + codigoUnico + '\'' +
                '}';
    }
}
