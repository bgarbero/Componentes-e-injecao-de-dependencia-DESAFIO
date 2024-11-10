# Desafio: Componentes e Injeção de Dependência

## Descrição do Desafio

Este repositório contém a solução para o desafio de criação de um sistema para calcular o valor total de um pedido, considerando a aplicação de um desconto e o valor do frete. O desafio faz parte do **Componentes e injeção de dependência** do curso **Java Spring Professional da DevSuperior** e foca no uso de componentes e injeção de dependência com **Java e Spring Boot**.

### Requisitos

- Criar um sistema que calcule o valor total do pedido aplicando um desconto ao valor básico e adicionando o valor do frete.
- Implementar componentes separados para a lógica de cálculo de pedidos e de frete, utilizando as anotações `@Service` do Spring Boot.
- Mostrar a saída no log do terminal.

### Regras para Cálculo do Frete

| Valor básico do pedido (sem desconto) | Valor do Frete |
|---------------------------------------|----------------|
| Abaixo de R$ 100,00                  | R$ 20,00       |
| De R$ 100,00 até R$ 200,00 (exclusive) | R$ 12,00       |
| R$ 200,00 ou mais                    | Grátis         |

### Exemplo de Entrada e Saída

#### Exemplo 1
**Entrada:**
- Código do pedido: `1034`
- Valor básico: `150.00`
- Porcentagem de desconto: `20.0`

**Saída:**
- Pedido código `1034`
- Valor total: `R$ 132.00`

#### Exemplo 2
**Entrada:**
- Código do pedido: `2282`
- Valor básico: `800.00`
- Porcentagem de desconto: `10.0`

**Saída:**
- Pedido código `2282`
- Valor total: `R$ 720.00`

#### Exemplo 3
**Entrada:**
- Código do pedido: `1309`
- Valor básico: `95.90`
- Porcentagem de desconto: `0.0`

**Saída:**
- Pedido código `1309`
- Valor total: `R$ 115.90`

## Estrutura do Projeto

- **OrderService**: Serviço responsável pelas operações referentes a pedidos.
- **ShippingService**: Serviço responsável pelas operações referentes ao frete.

Cada serviço deve ser registrado como um componente Spring com a anotação `@Service`.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.x**

## Como Executar

1. Clone este repositório: [Componentes-e-injecao-de-dependencia-DESAFIO](https://github.com/bgarbero/Componentes-e-injecao-de-dependencia-DESAFIO/blob/main/src/main/java/Desafio/Componentes/e/injecao/de/dependencia/DesafioComponentesEInjecaoDeDependenciaApplication.java)
2. Importe o projeto em sua IDE preferida.
3. Compile e execute o projeto usando a ferramenta de sua escolha (e.g., Maven, Gradle).
4. Verifique os logs do terminal para a saída do cálculo do pedido.

## Licença

Este projeto é desenvolvido para fins de aprendizado e prática de conceitos de desenvolvimento back-end com Spring Boot.

---

Para mais detalhes, acesse a [documentação oficial do desafio](https://devsuperior.com.br).
