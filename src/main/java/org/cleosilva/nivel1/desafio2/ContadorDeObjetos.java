package org.cleosilva.nivel1.desafio2;

public class ContadorDeObjetos {
    private static int numeroDeInstancias;

    public ContadorDeObjetos() {
        numeroDeInstancias++;
    }

    public static int  getTotalInstancias(){
        return numeroDeInstancias;
    }
}
