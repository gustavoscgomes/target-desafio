# Target-Desafio

Este repositório contém dois programas desenvolvidos como parte do processo seletivo da **Target Soluções**.

## Programas

### 1. Fibonacci Checker

O primeiro programa verifica se um número pertence à sequência de Fibonacci.

- **Endpoint**: `/fibonacci?number={numero}`
- **Exemplo de Requisição**:
  - GET `http://localhost:8080/fibonacci?number=8`
  
- **Exemplo de Resposta**:
  - `"O numero 8 pertence a sequencia de Fibonacci."`
  
### 2. String Checker

O segundo programa verifica a existência da letra `a` (maiúscula ou minúscula) em uma string e conta quantas vezes ela aparece.

- **Endpoint**: `/check-string?input={string}`
- **Exemplo de Requisição**:
  - GET `http://localhost:8080/check-string?input=Java`
  
- **Exemplo de Resposta**:
  - `"A letra 'a' ou 'A' ocorre 2 vez(es) na string informada."`

## Tecnologias Utilizadas
- **Java**
- **Spring Boot**
- **Maven**
