package org.cleosilva.nivel3.desafio1;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Use o Locale para padronizar para o decimal americano (por exemplo: 5.5)
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            ValidadorNota validadorNota = new ValidadorNota();
            double notaValida = 0.0;

            boolean leuNotaComSucesso = false;

            while (!leuNotaComSucesso) {
                try {
                    notaValida = validadorNota.lerNota(scanner);
                    leuNotaComSucesso = true;
                    System.out.println("Nota válida inserida: " + notaValida);
                } catch (NotaInvalidaException e) {
                    // Captura a exceção personalizada (checada)
                    System.out.println("Erro de validação: " + e.getMessage());
                    // Loop continuára pedindo uma nova nota
                } catch (Exception e) {
                    // Captura qualquer outra exceção inesperada
                    System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
                }
            }
        } catch (Exception e) {
            System.err.println("Erro ao inicializar o Scanner ou erro inesperado no programa principal: "
                    + e.getMessage());
        }
    }
}
