# Atividade Prática — Capítulo 9: Subprogramas - Linguagem de Programação

**Nome Completo:** JACKSON VICTOR GOMES COSTA  
**Turma:** SISTEMAS DE INFORMAÇÃO (2º Período)

---

# Tarefa 1 — Modularização em Java

## Objetivo

Transformar um programa monolítico em um sistema modularizado utilizando subprogramas.

## Comparação: Monolítico vs Modularizado

Nas versões monolíticas, o código fica muito grande e difícil de entender, pois todas as operações ficam concentradas dentro do método `main`. Isso reduz a legibilidade e dificulta a manutenção do sistema.

Na versão modularizada, o programa foi dividido em métodos menores, cada um com uma responsabilidade específica. Isso melhora bastante a organização e deixa o fluxo do programa mais claro.

Os métodos utilizados foram:

- `lerAluno()`
- `lerNotas()`
- `calcularMedia()`
- `determinarSituacao()`
- `imprimirRelatorio()`

## Análise

A modularização trouxe diversas vantagens:

- melhor legibilidade;
- maior reutilização de código;
- facilidade de manutenção;
- redução de repetição;
- aumento da coesão;
- métodos menores e mais organizados.

O método `main` passou a funcionar apenas como controlador do fluxo principal do sistema.

---

# Tarefa 2 — Modularização em Python

## Objetivo

Separar responsabilidades independentes utilizando funções.

## Comparação: Monolítico vs Modularizado

Na versão monolítica do sistema de vendas, os cálculos e impressões estavam todos em um único bloco de código, dificultando alterações futuras.

Após a modularização, o sistema ficou dividido em funções específicas, tornando o código mais organizado e reutilizável.

## Funções Utilizadas

- `ler_produto()`
- `calcular_subtotal()`
- `calcular_desconto()`
- `calcular_total()`
- `imprimir_cupom()`

## Discussão

As partes relacionadas aos cálculos de subtotal, desconto e impressão do cupom eram repetitivas. Ao transformá-las em funções, o código ficou mais reutilizável e simples de manter.

A modularização melhorou significativamente:

- a legibilidade;
- a clareza do fluxo;
- a reutilização das funções;
- a organização geral do sistema.

---

# Tarefa 3 — Passagem de Parâmetros por Valor em Java

## Explicação

### Por que o valor original não mudou?

Porque a variável recebida no método é apenas uma cópia local da variável original.

### O que significa “passagem por valor”?

Significa que o valor armazenado na variável é copiado para o método durante a chamada.

### Qual valor foi copiado?

O valor numérico da variável foi copiado para o parâmetro do método `alterarNumero()`.

## Conclusão

As alterações feitas dentro do método afetam apenas a cópia local da variável, não a variável original criada no método `main`.

---

# Tarefa 4 — Objetos e Referência em Java

## Explicação

### Java possui passagem por referência verdadeira?

Não. Java utiliza apenas passagem por valor.

### O que exatamente é copiado na chamada?

Quando um objeto é passado como parâmetro, o que é copiado é a referência (endereço de memória) do objeto.

### Por que alterações no objeto permanecem após a chamada?

Porque tanto a variável original quanto a cópia da referência apontam para o mesmo objeto na memória.

## Conclusão

A atividade demonstrou que:

- tipos primitivos copiam valores;
- objetos copiam referências;
- alterações em atributos permanecem porque o objeto é compartilhado.

---

# Tarefa 5 — Projeto Livre com Subprogramas

## Tema Escolhido

Sistema Bancário

## Justificativa

O sistema foi dividido em subprogramas para separar as funcionalidades principais, como depósitos, saques e exibição de extrato.

Essa divisão tornou o código mais organizado e facilitou a manutenção do sistema.

## Subprogramas Utilizados

- `mostrar_menu()`
- `ler_opcao()`
- `realizar_deposito(saldo)`
- `realizar_saque(saldo)`
- `exibir_extrato(historico)`
- `iniciar_sistema()`

## Dificuldades Encontradas

- controlar o saldo entre diferentes funções;
- definir corretamente os parâmetros;
- evitar repetição de código.

## Vantagens da Modularização

- maior organização;
- facilidade para adicionar novas funcionalidades;
- melhor reutilização;
- manutenção simplificada;
- código mais limpo e legível.

## Diagrama de Chamadas

```text
iniciar_sistema()
 ├── mostrar_menu()
 ├── ler_opcao()
 ├── realizar_deposito(saldo)
 ├── realizar_saque(saldo)
 └── exibir_extrato(historico)
```

---

# Conclusão Geral

A utilização de subprogramas melhora significativamente a qualidade do software. A modularização permite criar sistemas mais organizados, reutilizáveis e fáceis de manter, além de deixar o fluxo de execução mais claro e compreensível.

Os programas modularizados apresentaram:

- maior legibilidade;
- melhor organização;
- alta coesão;
- redução de repetição;
- facilidade de manutenção;
- maior reutilização de código.
