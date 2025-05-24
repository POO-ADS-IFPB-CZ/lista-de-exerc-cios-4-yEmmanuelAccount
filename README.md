# Lista de Exercício 04

[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/ybM3WQNb)

## Questão 01

1\. Determine se cada uma das seguintes afirmações é verdadeira ou falsa. Se uma instrução for falsa, explique por quê.

### a) Os construtores de superclasse não são herdados por subclasses.

$\quad$ Verdadeiro, os _construtores_ são específicos para a classe em que são criados.

### b) Um relacionamento **tem um** é implementado via herança.

$\quad$ Falso. Relacionamentos _tem um_ não são implementados via _herança_ e sim por _atributos_ instanciadas em outras classes.

### c) Quando uma subclasse redefinir um método de superclasse utilizando a mesma assinatura, diz-se que a subclasse sobrecarrega esse método de superclasse.

$\quad$ Falso. Quando ocorre uma redefinição de um método de uma _superclasse_ com a mesma assinatura em uma _subclasse_, é dito que o método foi **sub-escrito (Override)**

## Questão 02

2\. Alguns programadores preferem não utilizar acesso protected, porque acreditam que ele quebra o encapsulamento da superclasse. Discuta os méritos relativos de usar acesso protected versus acesso private em superclasses.

$\quad$ Falando primeiramente do uso do **private**, ela deixa os atributos visíveis apenas internamente na classe, deixando o código mais seguro e facilitando a manutenção até porque _"em Java, quanto menos você souber, melhor" - Paulo Freitas, 2025._ Em compensação, os códigos são menos facilmente reutilizáveis pois se tornam muito específicos e podem precisar de muitos métodos como _getters_ e _setters_.

$\quad$ Já o **protected** é um pouco mais flexível que o **private**, mas tem menos segurança como compensação. Como não é tão restrito é mais facilmente reutilizado e não precisam de tantos métodos como _getters_ e _setters_. Em compensação, é necessário ter mais cuidado com mudanças porque pode afetar muito agressivamente o código.

## Questão 03

3\. Explique como funciona a chamada de construtores em hierarquias de herança. Por que é obrigatório que o construtor da superclasse seja chamado explicitamente ou implicitamente?

$\quad$ Nos casos de hierarquias de herança, existe a obrigatoriedade do uso do _constructor_ da superclasse para que a inicialização dos objetos envolvidos comecem da _superclasse_ e apenas depois sigam para a _subclasse_. Com esse procedimento, é garantido o bom funcionamento do código com as _subclasses_ tendo suas dependências mantidas nas _superclasses_.

## Questão 04

4\. Crie uma classe abstrata Pagamento com o método processar(double valor). Implemente CartaoCredito, Boleto e Pix com regras diferentes (ex: taxa, desconto). No main, use polimorfismo para processar pagamentos com diferentes formas.

## Questão 05

5\. Crie a classe abstrata Personagem com o método atacar(). Crie subclasses Guerreiro, Mago e Arqueiro, cada uma com lógica distinta no ataque. Implemente um main que simule um turno de combate polimórfico.
