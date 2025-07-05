package org.cleosilva.nivel2.desafio3;

public class Caixa<T> {
    private T item;

    public Caixa(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
