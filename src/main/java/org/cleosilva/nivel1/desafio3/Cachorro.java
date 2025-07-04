package org.cleosilva.nivel1.desafio3;

public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Latido...");
    }


}
