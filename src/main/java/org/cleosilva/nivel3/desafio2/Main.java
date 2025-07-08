package org.cleosilva.nivel3.desafio2;

public class Main {
    public static void main(String[] args) {
        String path = "aplicacao.log";
        Logger logger = new Logger();

        System.out.println("Iniciando o registro de logs...");
        logger.log(path, "Tentando conexão");
        logger.log(path, "Conectando...");
        logger.log(path, "Conexão realizada");
        logger.log(path, "Fechando conexão");
        System.out.println("Registro de logs finalizado. Verifique o arquivo: " + path);

    }


}
