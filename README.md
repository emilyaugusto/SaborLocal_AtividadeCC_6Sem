# Atividade II CC 6Sem - Restaurante "SaborLocal"

Sistema de gestão para restaurantes desenvolvido em Java com foco em **Orientação a Objetos (OO)**.

## Sobre o Projeto
O **SaborLocal** modela o fluxo operacional de um restaurante, contemplando clientes (comum e rodízio), abertura e fecho de comandas por mesa, controle de pedidos e consulta a cardápios.

## Arquitetura e Pilares da OO
O projeto aplica rigorosamente os seguintes conceitos:
- **Abstração:** Classe base `Cliente` (abstrata).
- **Herança:** Subtipos `ClienteComum` e `ClienteRodizio` herdando de `Cliente`.
- **Polimorfismo:** Método `calcularConta()` adaptado para cada tipo de cliente.
- **Encapsulamento:** Proteção de dados sensíveis e estados da comanda por meio de operações controladas (sem acesso direto/indevido).

## Relacionamentos UML
- **Associação:** Ligação entre `Mesa`, `Comanda` e `Cliente`.
- **Agregação:** O `Cardapio` agrupa os `Prato`s (que existem de forma independente).
- **Composição:** A `Comanda` compõe os `Pedido`s (nascem e morrem junto com ela).

> 📌 *Nota: O diagrama UML completo (draw.io) encontra-se salvo no diretório do projeto.*

