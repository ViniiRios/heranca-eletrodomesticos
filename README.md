# Projeto: Herança de Eletrodomésticos em Java

## Integrantes

* Daniela Teixeira Abreu – RA: 4231923259
* Marcela Maria Barbosa – RA: 422222661
* Vinícius Raphael Rios de Lima – RA: 42321398

---

## Descrição

Este projeto tem como objetivo demonstrar o uso de **herança e polimorfismo em Java**, utilizando uma hierarquia de classes baseada em eletrodomésticos.

A classe base `Eletrodomestico` representa características comuns a todos os aparelhos, como marca, modelo, voltagem e estado (ligado/desligado). A partir dela, foram criadas duas subclasses:

* `Geladeira`
* `Microondas`

Cada subclasse possui atributos e comportamentos específicos, além de sobrescrever o método `acaoPrincipal()`, evidenciando o conceito de polimorfismo.

---

## Estrutura da Hierarquia

* **Classe mãe:**

  * `Eletrodomestico`

    * Atributos comuns (marca, modelo, voltagem, ligado)
    * Métodos comuns (`ligar`, `desligar`)
    * Método sobrescritível: `acaoPrincipal()`

* **Subclasses:**

  * `Geladeira`

    * Capacidade em litros
    * Função frost free
    * Sobrescrita de `acaoPrincipal()`

  * `Microondas`

    * Potência em watts
    * Função grill
    * Sobrescrita de `acaoPrincipal()`

---

## Polimorfismo

No `Main.java`, os objetos das subclasses são armazenados em uma lista do tipo `Eletrodomestico`, permitindo o uso de polimorfismo.

Cada objeto executa sua própria implementação do método `acaoPrincipal()`, mesmo sendo referenciado como a classe mãe.

---

## Execução

Ao executar o programa:

* São criados objetos de `Geladeira` e `Microondas`
* Ambos são adicionados a uma lista de `Eletrodomestico`
* O programa percorre a lista e:

  * Exibe os dados de cada objeto
  * Executa o método sobrescrito `acaoPrincipal()`
  * Liga e desliga os aparelhos, demonstrando herança de métodos

---

## Estrutura do Projeto

```
src/eletrodomesticos/
├── Eletrodomestico.java
├── Geladeira.java
├── Microondas.java
└── Main.java
```

---

## Conceitos Aplicados

* Programação Orientada a Objetos (POO)
* Herança
* Polimorfismo
* Encapsulamento
* Sobrescrita de métodos (`@Override`)
* Uso de listas genéricas (`List<Eletrodomestico>`)

---

## Considerações Finais

O projeto demonstra de forma prática como a herança permite reutilização de código e como o polimorfismo possibilita comportamentos diferentes para objetos de uma mesma hierarquia.

---
