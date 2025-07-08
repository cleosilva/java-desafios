# **Desafio 3.2: Registro de Logs em Arquivo (Foco: I/O Streams, Tratamento de Exceções)**

- **Cenário:** Você precisa registrar eventos importantes do seu programa em um arquivo de log.
- **Tarefa:**
    1. Crie uma classe `Logger` com um método `log(String mensagem)`.
    2. Dentro do método `log`, use `FileWriter` e `PrintWriter` (ou `BufferedWriter`) para escrever a `mensagem` em um arquivo chamado `aplicacao.log`.
    3. Adicione a data e hora atual à mensagem do log (ex: `[AAAA-MM-DD HH:MM:SS] Mensagem`).
    4. Garanta que o `FileWriter` seja fechado corretamente usando `try-with-resources` ou um bloco `finally`.
    5. Adicione tratamento de exceções (`IOException`) caso haja problemas ao escrever no arquivo.
    6. No `main`, crie uma instância de `Logger` e chame `log()` várias vezes com mensagens diferentes.
- **Objetivo de Aprendizagem:** Trabalhar com I/O Streams para escrita de arquivos, utilizar `try-with-resources` para fechamento automático de recursos e tratar exceções de I/O.