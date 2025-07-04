# **Desafio 1.3: Hierarquia de Animais (Foco: Herança)**

- **Cenário:** Você está modelando uma aplicação para um zoológico e precisa representar diferentes tipos de animais.
- **Tarefa:**
    1. Crie uma classe base `Animal` com um atributo `nome` e um método `fazerBarulho()`. O método `fazerBarulho()` deve imprimir uma mensagem genérica como "Algum barulho...".
    2. Crie duas classes que herdem de `Animal`: `Cachorro` e `Gato`.
    3. Sobrescreva o método `fazerBarulho()` em `Cachorro` para imprimir "Latido!".
    4. Sobrescreva o método `fazerBarulho()` em `Gato` para imprimir "Miado!".
    5. No método `main`, crie instâncias de `Animal`, `Cachorro` e `Gato` e chame o método `fazerBarulho()` para cada uma delas.
    - **Objetivo de Aprendizagem:** Praticar a herança para estabelecer uma hierarquia de classes e a sobrescrita de métodos para comportamentos específicos.