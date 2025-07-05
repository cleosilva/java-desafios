# **Desafio 2.2: Sistema de Pagamento (Foco: Interfaces, Polimorfismo)**

- **Cenário:** Um sistema que processa diferentes tipos de pagamentos.
- **Tarefa:**
    1. Crie uma interface chamada `ProcessadorDePagamento` com um método `processarPagamento(double valor)`.
    2. Crie duas classes que implementem `ProcessadorDePagamento`: `PagamentoCartaoCredito` e `PagamentoPix`.
    3. Em `PagamentoCartaoCredito`, o método `processarPagamento` deve imprimir "Processando pagamento com Cartão de Crédito no valor de X".
    4. Em `PagamentoPix`, o método `processarPagamento` deve imprimir "Processando pagamento com Pix no valor de X".
    5. No método `main`, crie uma `ArrayList` de `ProcessadorDePagamento`.
    6. Adicione instâncias de `PagamentoCartaoCredito` e `PagamentoPix` à lista.
    7. Percorra a lista e chame `processarPagamento()` para cada item.
- **Objetivo de Aprendizagem:** Entender o papel das interfaces para definir contratos de comportamento e como o polimorfismo se aplica a implementações de interfaces.