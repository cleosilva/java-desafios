package org.cleosilva.nivel1.desafio3;

public class Gato extends Animal{
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Miado...");
    }
}
