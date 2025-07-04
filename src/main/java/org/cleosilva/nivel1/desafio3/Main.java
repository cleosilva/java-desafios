package org.cleosilva.nivel1.desafio3;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal");
        Cachorro cachorro = new Cachorro("Bob");
        Gato gato = new Gato("Lili");

        System.out.println(animal.getNome());
        animal.fazerBarulho();
        System.out.println("==================");
        System.out.println(cachorro.getNome());
        cachorro.fazerBarulho();
        System.out.println("==================");
        System.out.println(gato.getNome());
        gato.fazerBarulho();
    }
}
