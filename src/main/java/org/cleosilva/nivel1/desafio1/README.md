# Nível 1: Fundamentos (Foco em Construtores, final, record, static, Herança)
### **Desafio 1.1: Gerenciamento Simples de Produtos (Foco: Construtores com Sobrecarga, `final`, `record`)**

- **Cenário:** Você precisa criar um sistema simples para gerenciar produtos em um estoque.

- **Tarefa:**
    1. Crie uma `record` chamada `Produto` que contenha:
        - `String nome`
        - `double preco`
        - `int quantidadeEmEstoque`
    2. Na `Produto` `record`, adicione um construtor "compacto" (o padrão) e um construtor com sobrecarga que receba apenas o `nome` e o `preco`, inicializando `quantidadeEmEstoque` como `0`.
    3. No método `main` de uma classe `Main`, crie:
        - Um `Produto` usando o construtor padrão.
        - Um `Produto` usando o construtor sobrecarregado.
        - Imprima os detalhes de ambos os produtos.
    4. Adicione um campo `final` na `Produto` `record` para um `codigoUnico` (gerado aleatoriamente ou por algum contador simples). Garanta que este código seja atribuído apenas uma vez na construção do objeto.

- **Objetivo de Aprendizagem:** Solidificar o uso de `record` para DTOs (Data Transfer Objects), construtores com sobrecarga e a imutabilidade garantida por `final`.

