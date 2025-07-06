package org.cleosilva.nivel3.desafio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidadorNota {

    public double lerNota(Scanner scanner) throws NotaInvalidaException {
        double nota = 0.0;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.println("Por favor insira uma nota (entre 0 e 10)");

            try{
                nota = scanner.nextDouble();
                entradaValida = true;

                if (nota < 0 || nota > 10){
                    throw new NotaInvalidaException("A nota deve estar entre 0 e 10");
                }
            } catch (InputMismatchException e){
                System.out.println("Erro: Entrada inválida, por favor digite um número válido.");
                scanner.next();
            }
        }
        return nota;
    }
}
