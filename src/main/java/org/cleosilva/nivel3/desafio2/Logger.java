package org.cleosilva.nivel3.desafio2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    public void log(String path, String mensagem)  {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-DD HH:MM:SS");
        // IMPORTANTE: Adicionar 'true' para o FileWriter para habilitar o
        // modo APPEND (adicionar ao final do arquivo), adiciona nova linha sem apagar a última
        try (FileWriter fw = new FileWriter(path, true);
             BufferedWriter buffWrite = new BufferedWriter(fw)) {
            String logEntry = "[" + LocalDateTime.now().format(formatter) + "] " + mensagem;
            buffWrite.append(logEntry);
            buffWrite.newLine();
            System.out.println("Log registrado: " + logEntry);
        }catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo de log " + e.getMessage());
        }
    }
}
