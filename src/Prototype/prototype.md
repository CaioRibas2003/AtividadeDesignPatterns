# Atividade Prática – Padrão Prototype
## Cenário

Um sistema de jogos precisa criar vários **personagens semelhantes**.

Cada personagem possui:

- nome
- classe
- nivel
- vida
- ataque

Criar todos os personagens manualmente pode ser repetitivo.

Por isso, o sistema utilizará **Prototype** para **clonar personagens existentes e modificar apenas algumas propriedades**.

## Entrega da atividade

O projeto deve conter:

- Classe `Personagem`
- Método `clone()`
- Código criando um personagem base
- Clonagem de pelo menos **3 personagens**
- Impressão dos personagens criados

## Teste da implementação

Crie:

- 1 personagem base
- 3 personagens clonados a partir dele

Modifique apenas o **nome** de cada clone.