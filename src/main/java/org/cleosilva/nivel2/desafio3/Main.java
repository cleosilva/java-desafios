package org.cleosilva.nivel2.desafio3;

import org.cleosilva.nivel1.desafio1.Produto;

public class Main {
    public static void main(String[] args) {
        Caixa<String> stringCaixa = new Caixa<>("Luana");
        Caixa<Integer> intergerCaixa = new Caixa<>(15);

        Caixa<Produto> produtoCaixa = new Caixa<>(new Produto("Escova", 15.99));

        System.out.println(stringCaixa.getItem());
        System.out.println(intergerCaixa.getItem());
        System.out.println(produtoCaixa.getItem());

    }
}
