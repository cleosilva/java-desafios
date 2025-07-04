package org.cleosilva.nivel1.desafio3;

public class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }
    public void fazerBarulho(){
        System.out.println("Algum barulho...");
    }

    public String getNome() {
        return nome;
    }
}
