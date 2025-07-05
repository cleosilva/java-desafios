# **Desafio 2.3: Caixa Genérica (Foco: Generics)**

- **Cenário:** Você quer uma "caixa" que possa armazenar qualquer tipo de objeto, mas de forma segura (sem precisar de `Casts` excessivos).
- **Tarefa:**
    1. Crie uma classe genérica chamada `Caixa<T>`.
    2. Esta classe deve ter um atributo do tipo `T` para armazenar o item.
    3. Crie um construtor que receba um item do tipo `T`.
    4. Crie um método `getItem()` que retorne o item do tipo `T`.
    5. No método `main`, crie instâncias de `Caixa` para armazenar um `String`, um `Integer` e um objeto de uma classe que você criou (por exemplo, `Produto` do Desafio 1.1).
    6. Recupere os itens das caixas e imprima-os, mostrando que você não precisa de `casts` explícitos.
- **Objetivo de Aprendizagem:** Compreender a utilidade dos Generics para criar classes e métodos que operam em diferentes tipos de dados de forma segura e reutilizável.