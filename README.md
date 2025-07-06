# 💻 Desafios Java — Do Básico ao Avançado

Este repositório reúne uma coleção de desafios em **Java**, organizados por **níveis de dificuldade** e **conceitos fundamentais da linguagem e da orientação a objetos**. Os desafios foram elaborados como parte da minha jornada de aprendizado e prática rumo à excelência em desenvolvimento back-end com Java.

---

## 🧭 Níveis e Foco de Aprendizagem

| Nível | Título                           | Foco                                                                 |
|-------|----------------------------------|----------------------------------------------------------------------|
| 1     | Fundamentos                      | Construtores, `final`, `record`, `static`, herança básica           |
| 2     | Abstração e Estrutura            | Coleções, polimorfismo, interfaces, generics                        |
| 3     | Robustez e Interação             | Exceções, leitura/escrita de arquivos (I/O Streams)                 |
| 4     | Integração e Arquitetura         | Camadas, serviços, padrões, integração de conceitos                 |

---

## ✅ Desafios Resolvidos

### 🟢 Nível 1: Fundamentos

| Código | Desafio                                                   | Caminho                   |
|--------|-----------------------------------------------------------|---------------------------|
| 1.1    | Gerenciamento Simples de Produtos                         | [`nivel-1/desafio-1.1`](https://github.com/cleosilva/java-desafios/tree/main/src/main/java/org/cleosilva/nivel1/desafio1) |
| 1.2    | Contador de Instâncias com `static`                       | [`nivel-1/desafio-1.2`](https://github.com/cleosilva/java-desafios/tree/main/src/main/java/org/cleosilva/nivel1/desafio2) |
| 1.3    | Hierarquia de Animais (Herança)                           | [`nivel-1/desafio-1.3`](https://github.com/cleosilva/java-desafios/tree/main/src/main/java/org/cleosilva/nivel1/desafio3) |

---

### 🟡 Nível 2: Abstração e Estrutura

| Código | Desafio                                                   | Caminho                                                                                                                 |
|--------|-----------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------|
| 2.1    | Sistema de Biblioteca (Herança + Coleções)                | [`nivel-2/desafio-2.1`](https://github.com/cleosilva/java-desafios/tree/main/src/main/java/org/cleosilva/nivel2/desafio1) |
| 2.2    | Sistema de Pagamento com Interface                        | [`nivel-2/desafio-2.2`](https://github.com/cleosilva/java-desafios/tree/main/src/main/java/org/cleosilva/nivel2/desafio2) |
| 2.3    | Caixa Genérica (Generics)                                 | [`nivel-2/desafio-2.3`](https://github.com/cleosilva/java-desafios/tree/main/src/main/java/org/cleosilva/nivel2/desafio3)                                                                                         |

---

### 🟠 Nível 3: Robustez e Interação

| Código | Desafio                                                   | Caminho                                |
|--------|-----------------------------------------------------------|----------------------------------------|
| 3.1    | Validação de Entrada com Exceções                         | [`nivel-3/desafio-3.1`](nivel-3/desafio-3.1) |
| 3.2    | Logger com Escrita em Arquivo                             | [`nivel-3/desafio-3.2`](nivel-3/desafio-3.2) |

---

### 🔴 Nível 4: Integração e Arquitetura

| Código | Desafio                                                   | Caminho                                |
|--------|-----------------------------------------------------------|----------------------------------------|
| 4.1    | Sistema de Pedidos Completo                               | [`nivel-4/desafio-4.1`](nivel-4/desafio-4.1) |
| 4.2    | Serviços com Logger e Configurações                       | [`nivel-4/desafio-4.2`](nivel-4/desafio-4.2) |

---

## 📦 Estrutura do Projeto

`````bash
java-desafios/
├── .github/
│      ├──workflows/
│            └── ci.yml
├── README.md
├── src/
│    ├──nivel1/
│         ├── desafio1/
│         ├── desafio2/
│         └── ...
│    ├── nivel-2/
│    ├── nivel-3/
│    └── nivel-4/
`````
---

## 🧪 Como Executar

Certifique-se de ter o Java instalado:

```bash
java -version
javac -version
````

Compile e execute um desafio:
````bash
cd nivel-1/desafio-1.1
javac Main.java
java Main
`````
### 📋 Critérios de Avaliação Pessoal

✅ Código (40%): organização, clareza, uso correto dos recursos

🧱 Arquitetura (30%): separação de responsabilidades, coesão e desacoplamento

📘 Boas Práticas (20%): nomenclatura, exceções, legibilidade

✨ Criatividade (10%): soluções elegantes e melhorias extras


### 🚀 Dicas de Progressão
Comece onde estiver confortável e vá subindo o nível gradualmente.

Faça revisões do seu próprio código após 1 ou 2 dias.

Refatore sempre que puder, é assim que se aprende.

Teste edge cases (valores nulos, limites, erros esperados).

Documente suas decisões técnicas.

### 💡 Próximos Passos
🧱 Design Patterns

☁️ Spring Framework e Web

🧵 Programação Reativa

🐳 Containers, APIs REST e microsserviços


### ✍️ Sobre
Todos os desafios foram pensados para simular cenários reais, focar em boas práticas e desenvolver uma base sólida que permita crescer com segurança e autonomia.

Sinta-se livre para clonar, testar, dar sugestões ou feedbacks!