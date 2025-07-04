package org.cleosilva.nivel1.desafio2;

public class Main {
    public static void main(String[] args) {
        ContadorDeObjetos instancia1 = new ContadorDeObjetos();
        ContadorDeObjetos instancia2 = new ContadorDeObjetos();
        ContadorDeObjetos instancia3 = new ContadorDeObjetos();
        ContadorDeObjetos instancia4 = new ContadorDeObjetos();
        ContadorDeObjetos instancia5 = new ContadorDeObjetos();

        System.out.println("Instâncias criadas: " +ContadorDeObjetos.getTotalInstancias());

    }
}
