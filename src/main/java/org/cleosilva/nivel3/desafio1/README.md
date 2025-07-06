# **Desafio 3.1: Validação de Entrada e Tratamento de Exceções (Foco: Tratamento de Exceções)**

- **Cenário:** Você está construindo um programa que calcula a média de notas, mas precisa garantir que as entradas do usuário sejam válidas.
- **Tarefa:**
    1. Crie um método `lerNota()` que use `Scanner` para ler um número decimal (a nota) do usuário.
    2. Dentro de `lerNota()`, implemente um bloco `try-catch` para lidar com `InputMismatchException` caso o usuário digite algo que não seja um número. Se a exceção ocorrer, imprima uma mensagem de erro e peça para o usuário digitar novamente.
    3. Implemente um loop que continue pedindo a nota até que uma entrada válida seja fornecida.
    4. Crie uma exceção personalizada (checada) chamada `NotaInvalidaException`.
    5. Modifique `lerNota()` para lançar `NotaInvalidaException` se a nota lida for menor que 0 ou maior que 10.
    6. No método `main`, chame `lerNota()` dentro de um `try-catch` para capturar `NotaInvalidaException` e imprima uma mensagem apropriada.
- **Objetivo de Aprendizagem:** Dominar o uso de `try-catch` para lidar com exceções de tempo de execução, criar e lançar exceções personalizadas (checada vs. não checada).