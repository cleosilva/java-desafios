# **Desafio 1.2: Contador de Instâncias (Foco: `static`)**

- **Cenário:** Você precisa saber quantas vezes um determinado tipo de objeto foi criado no seu sistema.
- **Tarefa:**
    1. Crie uma classe chamada `ContadorDeObjetos`.
    2. Dentro dela, declare um campo `static int` chamado `numeroDeInstancias`.
    3. No construtor de `ContadorDeObjetos`, incremente `numeroDeInstancias`.
    4. Crie um método `static` em `ContadorDeObjetos` chamado `getTotalInstancias()` que retorne o valor de `numeroDeInstancias`.
    5. No método `main`, crie várias instâncias de `ContadorDeObjetos` e, após criar cada uma, chame `ContadorDeObjetos.getTotalInstancias()` para verificar se a contagem está correta.
- **Objetivo de Aprendizagem:** Compreender o uso de membros `static` para dados e métodos que pertencem à classe, não a instâncias específicas.