package org.cleosilva.nivel1.desafio1;

public class Main {
    public static void main(String[] args) {
        Produto produtoPadrao = new Produto("Escova de dente", 1.55, 100 );
        Produto produtoComSobrecarga = new Produto("Luvas", 5.99);

        System.out.println("Detalhes produto padrão");
        System.out.println("Nome: " + produtoPadrao.nome());
        System.out.println("Preço: " + produtoPadrao.preco());
        System.out.println("Estoque:  " + produtoPadrao.quantidadeEmEstoque());
        System.out.println("Cádigo: " + produtoPadrao.codigoUnico());

        System.out.println("===========================================");
        System.out.println("Detalhes produto com sobrecarga");
        System.out.println("Nome: " + produtoComSobrecarga.nome());
        System.out.println("Preço: " + produtoComSobrecarga.preco());
        System.out.println("Estoque:  " + produtoComSobrecarga.quantidadeEmEstoque());
        System.out.println("Cádigo: " + produtoComSobrecarga.codigoUnico());
    }
}
