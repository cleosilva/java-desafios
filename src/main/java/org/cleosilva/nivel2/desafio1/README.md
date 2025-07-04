# **Desafio 2.1: Sistema de Biblioteca (Foco: Herança, Coleções, Polimorfismo)**

- **Cenário:** Desenvolver um sistema para gerenciar itens em uma biblioteca.
- **Tarefa:**
    1. Crie uma classe `ItemBiblioteca` com atributos `titulo` e `anoPublicacao`.
    2. Crie duas classes que herdem de `ItemBiblioteca`: `Livro` (com atributo `autor`) e `Revista` (com atributo `numeroEdicao`).
    3. Em cada uma das classes (`ItemBiblioteca`, `Livro`, `Revista`), adicione um método `exibirDetalhes()` que imprima as informações relevantes do item.
    4. No método `main`, crie uma `ArrayList` de `ItemBiblioteca`.
    5. Adicione objetos `Livro` e `Revista` a esta `ArrayList`.
    6. Percorra a `ArrayList` e chame o método `exibirDetalhes()` para cada item. Observe o polimorfismo em ação.
- **Objetivo de Aprendizagem:** Reforçar a herança, o uso de coleções para agrupar objetos de diferentes subtipos e como o polimorfismo permite tratar objetos de subclasses de forma genérica.